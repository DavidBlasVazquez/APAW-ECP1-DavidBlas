package es.upm.miw.apaw.factory;
import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.miw.apaw.builder.UserBuilder;
import es.upm.miw.apaw.entities.User;
import es.upm.miw.apaw.factory.UserFactory;

public class UserFactoryTest {
	@Test
	public void getReferenceTest() {
		long id = 1;
		User user = (new UserBuilder(id)).build();
		UserFactory.getInstance().setReference(id,user);
		assertEquals(user, UserFactory.getInstance().getReference(id));
	}
	@Test
	public void getDiferentReferenceTest() {
		long id = 1, idError=2;
		User user = (new UserBuilder(id)).build();
		UserFactory.getInstance().setReference(id, user);
		assertNotEquals(user, UserFactory.getInstance().getReference(idError));
	}
	@Test
	public void removeReferenceTest() {
		long id = 1;
		User user = (new UserBuilder(id)).build();
		UserFactory.getInstance().setReference(id, user);
		assertEquals(user, UserFactory.getInstance().getReference(id));
		UserFactory.getInstance().removeReference(id);
		assertNull(UserFactory.getInstance().getReference(id));
	}
	
}

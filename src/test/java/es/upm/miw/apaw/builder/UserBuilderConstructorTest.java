package es.upm.miw.apaw.builder;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import es.upm.miw.apaw.builder.UserBuilder;
import es.upm.miw.apaw.entities.User;

public class UserBuilderConstructorTest {
	private User user;
	private UserBuilder userBuilder;
	@Before
	public void before() {
		user = new User();
	}
	@Test
	public void idWithConstructorTest() {
		long id = 123456;
		user.setId(id);
		userBuilder = new UserBuilder(id);
		assertEquals(user.getId(), userBuilder.build().getId());
	}

}

package es.upm.miw.apaw.builder;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.apaw.builder.UserBuilder;
import es.upm.miw.apaw.entities.Sport;
import es.upm.miw.apaw.entities.User;

public class UserBuilderTest {
	private User user;
	private UserBuilder userBuilder;
	@Before
	public void before() {
		user = new User();
		userBuilder = new UserBuilder();
	}
	@Test
	public void idTest() {
		long id = 123456;
		user.setId(id);
		userBuilder.id(id);
		assertEquals(user.getId(), userBuilder.build().getId());
	}
	@Test
	public void nameTest() {
		String name = "name";
		user.setName(name);
		userBuilder.name(name);
		assertEquals(user.getName(), userBuilder.build().getName());
	}
	@Test
	public void birthDateTest() {
		Calendar calendar = Calendar.getInstance();
		user.setBirthDate(calendar);
		userBuilder.birthDate(calendar);
		assertEquals(user.getBirthDate(), userBuilder.build().getBirthDate());
	}
	@Test
	public void activeTest() {
		user.setActive(true);
		userBuilder.active(true);
		assertEquals(user.isActive(), userBuilder.build().isActive());
	}
	@Test
	public void sportsTest() {
		List<Sport> sports = new ArrayList<Sport>();
		user.setSports(sports);
		userBuilder.sports(sports);
		assertEquals(user.getSports(), userBuilder.build().getSports());
	}
}

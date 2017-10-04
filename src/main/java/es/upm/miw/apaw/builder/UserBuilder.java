package es.upm.miw.apaw.builder;

import java.util.Calendar;

import es.upm.miw.apaw.entities.User;

public class UserBuilder {
	private User user;

	
	public UserBuilder UserBuilder() {
		user = new User();
		return this;
	}
	public UserBuilder UserBuilder(long id) {
		user = new User();
		user.setId(id);
		return this;
	}
	public UserBuilder name (String name) {
		user.setName(name);
		return this;
	}
	public UserBuilder birthdate (Calendar birthdate) {
		user.setBirthdate(birthdate);
		return this;
	}
	public UserBuilder active (boolean active) {
		user.setActive(active);
		return this;
	}
	public User build() {
		return user;
	}
}

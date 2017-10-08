package es.upm.miw.apaw.builder;

import java.util.Calendar;

import es.upm.miw.apaw.entities.User;
import es.upm.miw.apaw.entities.Sport;

public class UserBuilder {
	private User user;
	public UserBuilder(long id) {
		user = new User(id);
	}
	public UserBuilder name (String name) {
		user.setName(name);
		return this;
	}
	public UserBuilder birthDate (Calendar birthdate) {
		user.setBirthDate(birthdate);
		return this;
	}
	public UserBuilder active (boolean active) {
		user.setActive(active);
		return this;
	}
	public UserBuilder sport(Sport sport) {
		user.addSport(sport);
		return this;
	}
	public User build() {
		return user;
	}
}

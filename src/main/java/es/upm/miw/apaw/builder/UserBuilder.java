package es.upm.miw.apaw.builder;

import java.util.Calendar;
import java.util.List;

import es.upm.miw.apaw.entities.User;
import es.upm.miw.apaw.entities.IUser;
import es.upm.miw.apaw.entities.Sport;

public class UserBuilder {
	private User user;
	public UserBuilder() {
		user = new User();
	}
	public UserBuilder(long id) {
		user = new User();
		user.setId(id);
	}
	public UserBuilder name (String name) {
		user.setName(name);
		return this;
	}
	public UserBuilder id (long id ) {
		user.setId(id);
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
	public UserBuilder sports(List<Sport> sports) {
		user.setSports(sports);
		return this;
	}
	public IUser build() {
		return user;
	}
}

package es.upm.miw.apaw.strategy;

import es.upm.miw.apaw.entities.User;

public abstract class UserStrategy extends User {
	public UserStrategy(Long id) {
		super(id);
	}
	public abstract String showPersonalData();

}

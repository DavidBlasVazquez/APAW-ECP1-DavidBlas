package es.upm.miw.apaw.factory;

import java.util.HashMap;
import java.util.Map;

import es.upm.miw.apaw.entities.User;

public class UserFactory {
	public static UserFactory instance = new UserFactory();
	public static UserFactory getInstance () {
		return instance;
	}
	private Map<Long,User> users;
	private UserFactory ( ) {
		users = new HashMap<Long, User>() ;
	}
	public void setReference(Long id, User user) {
		users.put(id, user);
	} 
	public User getReference(Long id) {
		return users.get(id);
	}
	public void removeReference(Long id) {
		users.remove(id);
	}
}

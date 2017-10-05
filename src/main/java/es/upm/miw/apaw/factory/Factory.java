package es.upm.miw.apaw.factory;

import java.util.HashMap;

import es.upm.miw.apaw.entities.ISport;
import es.upm.miw.apaw.entities.IUser;

public class Factory {
	private IFactory factory;
	private HashMap<Long,IUser> users;
	private HashMap<Long,ISport> sports;
	public void setFactory(IFactory factory) {
		this.factory = factory;
	}
	public IFactory getFactory() {
		return factory;
	}
	public IUser getUser(Long id) {
		return users.get(id);
	}
	public void setUser(IUser user) {
		users.put(user.getId(), user);
	}
	public ISport getSport(Long id) {
		return sports.get(id);
	}
	public void setSport (ISport sport) {
		sports.put(sport.getId(), sport);
	}
}

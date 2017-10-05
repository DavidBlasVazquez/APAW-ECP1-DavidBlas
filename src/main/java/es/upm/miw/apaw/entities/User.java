package es.upm.miw.apaw.entities;

import java.util.Calendar;
import java.util.List;

public class User implements IUser {
	private long id;
	private String name;
	private Calendar birthdate;
	private boolean active;
	private List<Sport> sports;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Calendar getBirthDate() {
		return birthdate;
	}
	public void setBirthDate(Calendar birthdate) {
		this.birthdate = birthdate;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public void setSports(List<Sport> sports) {
		this.sports = sports;
	}
	public List<Sport> getSports() {
		return sports;
	}
}

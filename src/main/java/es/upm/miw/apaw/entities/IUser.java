package es.upm.miw.apaw.entities;

import java.util.Calendar;
import java.util.List;

public interface IUser {
	public long getId() ;
	public void setId(long id);
	public String getName();
	public void setName(String name);
	public Calendar getBirthDate();
	public void setBirthDate(Calendar birthdate);
	public boolean isActive();
	public void setActive(boolean active);
	public void setSports(List<Sport> sports);
	public List<Sport> getSports();
}

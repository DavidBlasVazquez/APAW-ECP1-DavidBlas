package es.upm.miw.apaw.entities;

import java.util.Calendar;

public interface UserInterface {
		public long getId();
		public void setId(long id); 
		public String getName();
		public void setName(String name);
		public Calendar getBirthDate();
		public void setBirthDate(Calendar birthdate);
		public boolean isActive();
		public void setActive(boolean active);
		public void setSport(Long id, Sport sport);
		public Sport getSport(Long id);
}

package es.upm.miw.apaw.composite;

import java.util.Calendar;

import es.upm.miw.apaw.entities.Sport;
import es.upm.miw.apaw.entities.User;
import es.upm.miw.apaw.entities.UserInterface;

public class Individual extends Component implements UserInterface {
	private User user;
	
	public Individual (User user) {
		this.user = user;
	}

	@Override
	public long getId() {
		return user.getId();
	}

	@Override
	public void setId(long id) {
		user.setId(id);
	}

	@Override
	public String getName() {
		return user.getName();
	}

	@Override
	public void setName(String name) {
		user.setName(name);
	}

	@Override
	public Calendar getBirthDate() {
		return user.getBirthDate();
	}

	@Override
	public void setBirthDate(Calendar birthDate) {
		user.setBirthDate(birthDate);
	}

	@Override
	public boolean isActive() {
		return user.isActive();
	}

	@Override
	public void setActive(boolean active) {
		user.setActive(active);
	}

	@Override
	public void remove(Component component) {
	}

	@Override
	public void add(Component component) {
	}

	@Override
	public String view() {
		return String.valueOf(user.getId());
	}

	@Override
	public boolean isGroup() {
		return false;
	}

	@Override
	public void setSport(Long id, Sport sport) {
		user.addSport(sport);	
	}

	@Override
	public Sport getSport(Long id) {
		return user.getSport(id);

	}
}

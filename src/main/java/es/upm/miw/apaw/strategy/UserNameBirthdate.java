package es.upm.miw.apaw.strategy;

public class UserNameBirthdate extends UserStrategy {
	public UserNameBirthdate(Long id) {
		super(id);
	}
	@Override
	public String showPersonalData() {
		return this.getName() + " - " + this.getBirthDate();
	}
}

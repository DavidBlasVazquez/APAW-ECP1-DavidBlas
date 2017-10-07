package es.upm.miw.apaw.strategy;

public class UserNameBirthdate extends UserStrategy {
	@Override
	public String showPersonalData() {
		return this.getName() + " - " + this.getBirthDate();
	}
}

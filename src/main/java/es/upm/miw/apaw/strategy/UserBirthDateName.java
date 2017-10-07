package es.upm.miw.apaw.strategy;

public class UserBirthDateName extends UserStrategy {
	@Override
	public String showPersonalData() {
		return this.getBirthdate() + " - " + this.getName();
	}
}

package es.upm.miw.apaw.strategy;

public class UserBirthDateName extends UserStrategy {
	public UserBirthDateName(Long id) {
		super(id);
	}
	@Override
	public String showPersonalData() {
		return this.getBirthDate() + " - " + this.getName();
	}
}

package es.upm.miw.apaw.strategy;

public class OrderTwo extends StrategyClass {
	@Override
	public String showPersonalData() {
		return this.getBirthdate() + " - " + this.getName();
	}
}

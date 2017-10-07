package es.upm.miw.apaw.strategy;

public class OrderOne extends StrategyClass {
	@Override
	public String showPersonalData() {
		return this.getName() + " - " + this.getBirthdate();
	}
}

package designpattern.decoratorpattern.startbuzzCoffee.condimentcomponent;

import designpattern.decoratorpattern.startbuzzCoffee.Beverage;
import designpattern.decoratorpattern.startbuzzCoffee.CondimentDecorator;

public class Soy extends CondimentDecorator {
	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}
	@Override
	public double cost() {
		return .30 + beverage.cost();
	}
}
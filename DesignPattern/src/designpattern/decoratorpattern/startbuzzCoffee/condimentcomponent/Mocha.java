package designpattern.decoratorpattern.startbuzzCoffee.condimentcomponent;

import designpattern.decoratorpattern.startbuzzCoffee.Beverage;
import designpattern.decoratorpattern.startbuzzCoffee.CondimentDecorator;

public class Mocha extends CondimentDecorator {
	Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
	@Override
	public double cost() {
		return .20 + beverage.cost();
	}
}

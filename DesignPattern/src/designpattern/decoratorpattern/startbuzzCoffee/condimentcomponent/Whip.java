package designpattern.decoratorpattern.startbuzzCoffee.condimentcomponent;

import designpattern.decoratorpattern.startbuzzCoffee.Beverage;
import designpattern.decoratorpattern.startbuzzCoffee.CondimentDecorator;

public class Whip extends CondimentDecorator {
	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
	
	@Override
	public double cost() {
		return .12 + beverage.cost();
	}
}
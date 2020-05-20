package designpattern.decoratorpattern.startbuzzCoffee.concretecomponent;

import designpattern.decoratorpattern.startbuzzCoffee.Beverage;

public class DarkRoast extends Beverage {
	
	public DarkRoast() {
		description = "DarkRoast";
	}
	@Override
	public double cost() {
		return 2.10;
	}
}
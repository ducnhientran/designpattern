package designpattern.abstractfactorypattern.product;

public class WoodChair implements Chair{

	@Override
	public void create() {
		System.out.println("This Chair was created by wood");
		
	}

}

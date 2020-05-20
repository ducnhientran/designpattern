package designpattern.abstractfactorypattern.product;

public class FlasticChair implements Chair{

	@Override
	public void create() {
		System.out.println("This Chair was created by Flastic!");
	}

}

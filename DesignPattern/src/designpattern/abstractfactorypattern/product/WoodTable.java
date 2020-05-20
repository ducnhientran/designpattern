package designpattern.abstractfactorypattern.product;

public class WoodTable implements Table{

	@Override
	public void create() {
		System.out.println("This Table is create by wood");
		
	}

}

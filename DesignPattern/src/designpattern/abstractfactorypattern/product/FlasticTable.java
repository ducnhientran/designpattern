package designpattern.abstractfactorypattern.product;

public class FlasticTable implements Table{

	@Override
	public void create() {
		System.out.println("This table was created by Flastic");
		
	}

}

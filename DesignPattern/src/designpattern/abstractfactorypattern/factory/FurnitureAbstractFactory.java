package designpattern.abstractfactorypattern.factory;

import designpattern.abstractfactorypattern.product.Chair;
import designpattern.abstractfactorypattern.product.Table;

public abstract class FurnitureAbstractFactory {

	public abstract Chair createChair();
	
	public abstract Table createTable();
	
}

package designpattern.abstractfactorypattern.factory;

import designpattern.abstractfactorypattern.product.Chair;
import designpattern.abstractfactorypattern.product.Table;
import designpattern.abstractfactorypattern.product.WoodChair;
import designpattern.abstractfactorypattern.product.WoodTable;

public class WoodFactory extends FurnitureAbstractFactory{

	@Override
	public Chair createChair() {
		
		return new WoodChair();
	}

	@Override
	public Table createTable() {
		return new WoodTable();
	}

}

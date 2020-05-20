package designpattern.abstractfactorypattern.factory;

import designpattern.abstractfactorypattern.product.Chair;
import designpattern.abstractfactorypattern.product.FlasticChair;
import designpattern.abstractfactorypattern.product.FlasticTable;
import designpattern.abstractfactorypattern.product.Table;

public class FlasticFactory extends FurnitureAbstractFactory {

	@Override
	public Chair createChair() {
		return new FlasticChair() ;
	}

	@Override
	public Table createTable() {
		return new FlasticTable();
	}

}

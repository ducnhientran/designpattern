package designpattern.abstractfactorypattern;

import designpattern.abstractfactorypattern.factory.FurnitureAbstractFactory;
import designpattern.abstractfactorypattern.factory.FurnitureFactory;
import designpattern.abstractfactorypattern.factory.MaterialType;

public class RunFactory {

	public static void main(String[] args) {
		//FurnitureAbstractFactory furnitureAbstractFactory = FurnitureFactory.getFactory(MaterialType.FLASTIC);
		FurnitureAbstractFactory furnitureAbstractFactory = FurnitureFactory.getFactory(MaterialType.WOOD);
		
		furnitureAbstractFactory.createChair().create();
		furnitureAbstractFactory.createTable().create();
		
	}
}

package designpattern.factorypatern;

import designpattern.factorypatern.employee.Developer;
import designpattern.factorypatern.employee.ITManager;
import designpattern.factorypatern.employee.SolutionAchitect;

public class EmployeeFactory {
	
	public static final EmployeePosition setEmployee(EmployeeType type){
		switch (type) {
			case DEVELOPER:
				return new Developer();
			case ITMANAGER:
				return new ITManager();
			case SOLUTIONARTCHITECT:
				return new SolutionAchitect();
			default:
				throw new IllegalArgumentException("This position not supported");
		}
	}
}

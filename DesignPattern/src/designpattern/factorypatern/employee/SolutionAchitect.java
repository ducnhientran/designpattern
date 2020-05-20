package designpattern.factorypatern.employee;

import designpattern.factorypatern.EmployeePosition;
import designpattern.factorypatern.EmployeeType;

public class SolutionAchitect implements EmployeePosition {

	@Override
	public EmployeeType getPositionEmployee() {
		
		return EmployeeType.SOLUTIONARTCHITECT;
	}

}

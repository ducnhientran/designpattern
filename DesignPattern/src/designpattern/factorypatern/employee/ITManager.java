package designpattern.factorypatern.employee;

import designpattern.factorypatern.EmployeePosition;
import designpattern.factorypatern.EmployeeType;

public class ITManager implements EmployeePosition {

	@Override
	public EmployeeType getPositionEmployee() {
		
		return EmployeeType.ITMANAGER;
	}

}

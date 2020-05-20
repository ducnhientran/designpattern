package designpattern.decoratorpattern.employee.decorator;

import java.util.Date;

import designpattern.decoratorpattern.employee.component.EmployeeComponent;

public class EmployeeDecorator implements EmployeeComponent {

	
	protected EmployeeComponent employee;
	 
    protected EmployeeDecorator(EmployeeComponent employee) {
        this.employee = employee;
    }
    
	@Override
	public void doTask() {

	}

	@Override
	public String getName() {
		return employee.getName();
	}

	@Override
	public void join(Date joinDate) {
		employee.join(joinDate);
	}

	@Override
	public void terminate(Date terminateDate) {
		employee.terminate(terminateDate);
	}

}

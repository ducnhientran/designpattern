package designpattern.decoratorpattern.employee;

import designpattern.decoratorpattern.employee.component.EmployeeComponent;
import designpattern.decoratorpattern.employee.component.EmployeeConcreteComponent;
import designpattern.decoratorpattern.employee.position.Manager;
import designpattern.decoratorpattern.employee.position.TeamLeader;

public class Run {
	
	 public static void main(String[] args) {
	        System.out.println("NORMAL EMPLOYEE: ");
	        EmployeeComponent employee = new EmployeeConcreteComponent("IT");
	        employee.showBasicInformation();
	        employee.doTask();
	 
	        System.out.println("\nTEAM LEADER: ");
	        EmployeeComponent teamLeader = new TeamLeader(employee);
	        teamLeader.showBasicInformation();
	        teamLeader.doTask();
	 
	        System.out.println("\nMANAGER: ");
	        EmployeeComponent manager = new Manager(employee);
	        manager.showBasicInformation();
	        manager.doTask();
	 
	        System.out.println("\nTEAM LEADER AND MANAGER: ");
	        EmployeeComponent teamLeaderAndManager = new Manager(teamLeader);
	        teamLeaderAndManager.showBasicInformation();
	        teamLeaderAndManager.doTask();
	    }
	 
}

package designpattern.factorypatern;

public class RunFactory {

	public static void main(String[] args) {
		Employee em = new Employee();
		
		//em.setpositionn(EmployeeType.DEVELOPER);
		//em.setpositionn(EmployeeType.ITMANAGER);
		em.setpositionn(EmployeeType.SOLUTIONARTCHITECT);
		em.setName("NhienTD");
		em.setAge(26);
		
		System.out.println(em.toString());
		
		
	}
	
}

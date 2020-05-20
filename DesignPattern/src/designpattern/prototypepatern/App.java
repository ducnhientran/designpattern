package designpattern.prototypepatern;

public class App {
	public static void main(String[] args) {
		Employee employee = new Employee("NhienTD", 26, "Quang Tri", "");
		Employee employeeclone = (Employee) employee.clone();
		employeeclone.setOrthers("It have just cloned from employee!");
		
		System.out.println(employee.toString());
		System.out.println("*********************************");
		System.out.println(employeeclone.toString());
	}
}

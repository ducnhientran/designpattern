package designpattern.prototypepatern;

public class Employee implements Cloneable{

	private String name;
	
	private Integer age;
	
	private String address;
	
	private String orthers;

	public Employee(String name, Integer age, String address, String orthers) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.orthers = orthers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOrthers() {
		return orthers;
	}

	public void setOrthers(String orthers) {
		this.orthers = orthers;
	}	
	
	@Override
	protected Object clone(){
		 try {
	            return (Employee) super.clone();
	        } catch (CloneNotSupportedException e) {
	            e.printStackTrace();
	        }
		return null;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", address="	+ address + ", orthers=" + orthers + "]";
	}
}

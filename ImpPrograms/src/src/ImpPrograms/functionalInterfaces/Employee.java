package ImpPrograms.functionalInterfaces;

public class Employee {
	String name;
	int salry;
	
	public Employee(String name, int salry) {
		super();
		this.name = name;
		this.salry = salry;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salry=" + salry + "]";
	}

}

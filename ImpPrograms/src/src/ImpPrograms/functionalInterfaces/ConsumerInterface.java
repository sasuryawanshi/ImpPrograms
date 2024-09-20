package ImpPrograms.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
public static void main(String[] args) {
	
	List <Employee> list= new ArrayList<Employee>();
	list.add(new Employee("Sam",10004));
	list.add(new Employee("Jam",52004));
	list.add(new Employee("Jim",82004));
	Consumer<Employee> con= s->{
		System.out.print(s.name+"....");
		System.out.println(s.salry);
	};
	
	for(Employee emp:list) {
		con.accept(emp);
	}
	
}
}

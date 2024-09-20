package ImpPrograms.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterface {
//Predicate checks boolean condition with abstract method->  test(T t)
	// it is in java.util.function package

public static void main(String[] args) {

	List <Employee> list= new ArrayList<Employee>();
	list.add(new Employee("Sam",10004));
	list.add(new Employee("Jam",52004));
	list.add(new Employee("Jim",82004));
	
	Predicate<Employee> prd= e->e.salry<50000;
	// check salary less than 50k
	for( Employee e:list) {
		System.out.println(prd.test(e));
	}
	
	//check names staring with  'J'
	Predicate<String> pred=e->e.charAt(0)=='J';
	
	for( Employee namesList :list) {
		System.out.println(pred.test(namesList.name));
		System.out.println(namesList);
}
	}
}

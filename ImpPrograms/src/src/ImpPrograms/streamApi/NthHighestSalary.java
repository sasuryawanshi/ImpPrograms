package ImpPrograms.streamApi;/*
package streamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;



public class NthHighestSalary {

	public static void main(String[] args) {

		ArrayList<Employee> l = new ArrayList<Employee>();

		l.add(new Employee(12, "Sam", 25000.0));
		l.add(new Employee(14, "Kim", 35000.3));
		l.add(new Employee(13, "Jack", 45000.5));
		l.add(new Employee(11, "Tim", 53000.0));

		// print 2nd highest salary
		Optional<Double> result = l.stream().map(e -> e.getEmpSalary()).sorted(Comparator.reverseOrder()).skip(1)
				.findFirst();
		System.out.println(result.get());//get() is Optional class method returns value from object if present if not throws exception

		// 3 rd highest salary
		Optional<Double> result1 = l.stream().map(e -> e.getEmpSalary()).sorted(Comparator.reverseOrder()).skip(2)
				.findFirst();
		System.out.println(result1.get());

		// 4 th highest salary
		Optional<Double> result2 = l.stream().map(e -> e.getEmpSalary()).sorted(Comparator.reverseOrder()).skip(3)
				.findFirst();
		System.out.println(result2.get());

		// sort all employee id's
		List<Integer> empId = l.stream().map(e -> e.getEmployeeId()).sorted().collect(Collectors.toList());
		System.out.println(empId);
		// for normal sorting -> l.stream().sorted().collect(Collectors.toList());

		// sort employee by name
		List<String> nameList = l.stream().map(e -> e.getEmpName()).sorted().collect(Collectors.toList());
		System.out.println(nameList);

		// 2nd highest id
		Optional<Integer> findId = l.stream().map(e -> e.getEmployeeId()).sorted(Comparator.reverseOrder()).skip(1)
				.findFirst();
		System.out.println(findId);
	}

}
*/

package ImpPrograms.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamOperations {
	public static void main(String[] args) {
		  Company c1 = new   Company(121, "Wipro", 22000);
		  Company c2 = new   Company(122, "HCL", 30000);
		  Company c3 = new   Company(131, "TECHM", 15000);
		  Company c4 = new   Company(151, "IBM", 32000);
		  Company c5 = new   Company(135, "IBM", 32000);

		List<  Company> list = Arrays.asList(c1, c2, c3, c4,c5);
		
		//Calculate the sum of employees
		Integer collect2 = list.stream().collect(Collectors.summingInt(  Company::getEmpCount));
		System.out.println(collect2);
		
		//Group company by name
		Map<String, List<  Company>> collect3 = list.stream().collect(Collectors.groupingBy(  Company::getcName));
		System.out.println(collect3);
		
		//find objects in which name starts with "I" or by given element in String
		List<Company> nameList = list.stream().filter(i->i.getcName().startsWith("I")).collect(Collectors.toList());
		System.out.println("......"+nameList);
		
		//sorting and removing duplicate
		List<Integer> alist = Arrays.asList(4,5,6,8,8,7,9,3,4);
		List<Integer> collect4 = alist.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println(collect4);
		
		//find first element in the list
		alist.stream().findFirst().ifPresent(System.out::println);
		
	}
}
package ImpPrograms.streamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamNumberOperations {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(40, 20, 35, 42, 41, 28, 40, 29, 35, 65, 54);
		
		// find numbers starting with 2
		List<String> collect = list.stream().map(i -> i + "").filter(i -> i.startsWith("2"))
				.collect(Collectors.toList());// convert integer to string by map
		System.out.println(collect);
		
		// find duplicate numbers
		Set<Integer> set = new HashSet<Integer>();
		//list.stream().filter(i -> !set.add(i)).collect(Collectors.toList()).forEach(System.out::print);

		// find even numbers and multiply by 2 but keep odd numbers in list as it is
		List<Integer> modifiedNum = list.stream().map(i -> i % 2 == 0 ? i * 2 : i).collect(Collectors.toList());
		System.out.println(modifiedNum);
		
		//find first number
		System.out.println("first number");
		list.stream().findFirst().ifPresent(System.out::println);
		
		//find max value
		Integer integer = list.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(integer);
		
		//sort in reverse order
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		}
}

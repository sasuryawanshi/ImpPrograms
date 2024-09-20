package ImpPrograms.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterDataOfStream {
	public static void main(String[] args) {
		//Using multiple filters
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(55);list.add(20);list.add(57);list.add(10);list.add(90);list.add(96);
		
		List<Integer> collect = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(collect);
		// find salary in between given range and count the employees
		List<Integer> asList = Arrays.asList(10000, 20000, 30000, 50000, 60000, 70000, 90000, 60000);
		
		List<Integer> collect1 = asList.stream().filter(i -> i > 20000 && i < 70000).collect(Collectors.toList());
		// System.out.println(collect1);//list of salary of given range
		long collect3 = asList.stream().filter(i -> i > 20000 && i < 80000).count();
		// System.out.println(collect);//count of no of entries
		List<Integer> collect2 = asList.stream().filter(i -> i % 3 == 0).map(i -> i * 5).collect(Collectors.toList());
		System.out.println(collect2);
		List<Integer> list1 = asList.stream().filter(i -> i % 2 == 0).filter(i -> i > 3).collect(Collectors.toList());
		// System.out.println(list1);
		Map<Boolean, List<Integer>> list2 = asList.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
		// System.out.println(list2);
		// List<Integer> list3 = list.get(true);
		// System.out.println(list2);
		List<Integer> collect5 = asList.stream().filter(i -> i % 2 == 0 || i % 2 != 0).collect(Collectors.toList());
		// System.out.println(collect5);

		// List<Integer> collect2 = asList.stream().filter(i -> i > 3).filter(i -> i % 3
		// == 0).collect(Collectors.toList());
		// System.out.println(collect2);
	}
}

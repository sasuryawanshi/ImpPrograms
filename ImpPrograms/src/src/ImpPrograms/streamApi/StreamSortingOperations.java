package ImpPrograms.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortingOperations {
	public static void main(String[] args) {
		// sort()-It modifies the list it is called on. That is, the sorted list is stored in the same list; a new list is not created.
		// it is Collection interface method
		// sorted() is Stream interface method returns a sorted list as result
		List<String> names = Arrays.asList("James", "Mary", "Ken", "Joe");
		names.sort(Comparator.reverseOrder());
		System.out.println(names);

		System.out.println("--------------------------------------------------------");

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(47);
		list.add(20);
		list.add(50);
		list.add(22);
		list.add(66);
		list.add(35);

		int sum = list.stream().filter(i->i%2==0).mapToInt(j->j*100).sum();
		//System.out.println("Original List" + sum);
		// for normal sorting use sorted() 
	
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted List" + sortedList);
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(50);
		marks.add(43);
		marks.add(20);
		marks.add(25);
		marks.add(40);
		/*
		 * for natural sorting use sorted without comparator
		 *  List<Integer> soetedList = marks.stream().sorted().collect(Collectors.toList());
		 * System.out.println(soetedList);
		*/
		
		//for customized sorting use sorted(comparator)
		List<Integer> collect = marks.stream().sorted((e1, e2) -> e1.compareTo(e2)).collect(Collectors.toList());
		System.out.println(collect);

	}
}

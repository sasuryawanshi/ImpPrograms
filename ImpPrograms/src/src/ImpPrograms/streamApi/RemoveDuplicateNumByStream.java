package ImpPrograms.streamApi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateNumByStream {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 7, 5, 5, 6, 7, 2);
		Set<Integer> set = new HashSet<Integer>();

		// print duplicate element
		list.stream().filter(i -> !set.add(i)).forEach(System.out::print);
		// print 'list' of duplicate elements
		List<Integer> duplicateElements = list.stream().filter(i -> !set.add(i)).collect(Collectors.toList());
		System.out.println(duplicateElements);
		// sorting and removing duplicate
		List<Integer> alist = Arrays.asList(4, 5, 6, 8, 8, 7, 9, 3, 4);
		List<Integer> collect4 = alist.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println(collect4);
		// find first element in the list
		alist.stream().findFirst().ifPresent(System.out::println);

	}
}

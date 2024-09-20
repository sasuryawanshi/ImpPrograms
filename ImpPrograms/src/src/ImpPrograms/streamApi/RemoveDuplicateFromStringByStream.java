package ImpPrograms.streamApi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicateFromStringByStream {
	public static void main(String[] args) {

		// Given a String, find occurrence of each character
		String str = "ABCDAB";// make sure there is no gap in characters
		Map<String, Long> map = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
String ss="Abc Abc sac had sac";		// Print duplicate elements from String
		HashSet<String> set = new HashSet<String>();
		List<String> collect = Arrays.stream(ss.split("")).filter(i -> !set.add(i)).collect(Collectors.toList());
		System.out.println(collect);

		// Remove duplicate from String and print String again
		String collect2 = str.chars().mapToObj(c->(char) c).distinct().map(String::valueOf).collect(Collectors.joining());
		System.out.println(collect2);
		
		//It will keep unique elements and return String
		String st = "AABACA";
		String collect3 = Arrays.stream(st.split("")).distinct().collect(Collectors.joining());
		System.out.println(collect3);

		// get current date and time
		/*
		 * System.out.println(java.time.LocalDate.now());
		 * System.out.println(java.time.LocalTime.now());
		 * System.out.println(java.time.LocalDateTime.now());
		 */
	}
}

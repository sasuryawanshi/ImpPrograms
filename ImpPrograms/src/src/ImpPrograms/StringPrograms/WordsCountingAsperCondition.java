package ImpPrograms.StringPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordsCountingAsperCondition {
	public static void main(String[] args) {
		String arr[] = { "aa", "aaz", "aaav", "aab", "aaz", "aab", "baa", "aaav", };

		List<String> collect = Arrays.stream(arr).filter(i -> i.startsWith("aaa")).collect(Collectors.toList());
		// System.out.println(collect);
		Map<String, Long> collect2 = Arrays.stream(arr).filter(i -> i.startsWith("aa"))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect2);
	}
}

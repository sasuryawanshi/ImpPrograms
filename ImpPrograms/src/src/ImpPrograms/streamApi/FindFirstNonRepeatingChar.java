package ImpPrograms.streamApi;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingChar {
	public static void main(String[] args) {
		String str = "All Love Java And Python";
		// to find second non repeating char skip first and find first
		String character = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).
				entrySet().stream().filter(x -> x.getValue() == 1).map(x ->x.getKey())
				.map(String::valueOf).collect(Collectors.joining());
		System.out.println("characters which are no repeating : "+character);
		// to find first repeating char
// find reapeating  character string

String  repeating =	str.chars().mapToObj(c ->(char) c).
				collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter( x -> x.getValue() > 1).
				map(z -> z.getKey()).map(String::valueOf).collect(Collectors.joining()).replace(" ","");

		System.out.println("repeating String  : "+repeating);


	Optional<Character> firstReatingCharator =	str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
				Collectors.counting())).entrySet().stream()
						.filter( characterLongEntry ->  characterLongEntry.getValue() > 1).map( entry -> entry.getKey())
						.findFirst();

		firstReatingCharator.ifPresent( x -> System.out.println("## "+x));


		// if String contains spaces
		String st = "HH II ALLL";
		String charf =  st.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).
				entrySet().stream().filter(x -> x.getValue() == 1).map(x ->x.getKey())
				.map(String::valueOf).findFirst().get();
		System.out.println(charf);
		// Even if the upper logic is used to for this string, it will give same result

	}

}

package ImpPrograms.streamApi;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {
	public static void main(String[] args) {
		String str = "Java is awesome";
		Character character = str.chars().mapToObj(s -> Character.valueOf((char) s))
				  .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
		  	Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue()
		  == 1).map(entry -> entry.getKey()).findFirst().get();
		  System.out.println(character);
		}
}

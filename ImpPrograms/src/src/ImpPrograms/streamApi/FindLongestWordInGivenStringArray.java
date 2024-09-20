package ImpPrograms.streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class FindLongestWordInGivenStringArray {
public static void main(String[] args) {
	String[] str= {"Sam","Jim","John","Deepak","Ravi"};
	
Optional<String>  string = Arrays.stream(str).sorted(Comparator.comparingInt(String::length).reversed()).findFirst();

	string.ifPresent(strin -> System.out.println(strin));
}
}

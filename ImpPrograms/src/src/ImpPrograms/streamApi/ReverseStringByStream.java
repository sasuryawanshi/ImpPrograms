package ImpPrograms.streamApi;

import java.util.stream.IntStream;

public class ReverseStringByStream {
	public static void main(String[] args) {
		String str = "ABCDE";
	// int length = str.length();
	//	IntStream.range(0, length).map(i -> length - 1 - i).mapToObj(j -> str.charAt(j)).forEach(System.out::print);
		IntStream.range(0, str.length()).map(i -> str.length() - 1 - i).mapToObj(j -> str.charAt(j)).forEach(System.out::print);		
	}
}
 
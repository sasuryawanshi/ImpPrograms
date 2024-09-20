package ImpPrograms.StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountMultipleOccurencesInString {

	public static void main(String[] args) {
		String s=new String();
		String s1=new String("Sam");
		String str = "BAABAMMMD";
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char[] charArray = str.toCharArray();
		
		
		for (char c : charArray) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else
				charMap.put(c, 1);
		}
		System.out.println(charMap);
	}

}

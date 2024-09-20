package ImpPrograms.StringPrograms;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicateWordsFromString {
	public static void main(String[] args) {

		String str = "I am a good man and a gentle man I am";

		String[] words = str.split(" ");// check empty spaces carefully

		LinkedHashSet<String> hs = new LinkedHashSet<String>();

		for (String word : words) {
			hs.add(word);
		}
		Iterator<String> iterator = hs.iterator();
		while (iterator.hasNext()) {
			String fianlString = iterator.next();
			System.out.print(fianlString + " ");
		}
	}
}

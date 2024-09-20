package ImpPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class FindKeyValueFromMap {
	public static void main(String[] args) {

		HashMap<String, Integer> hmap = new HashMap<String, Integer>();

		hmap.put("Sam", 9);
		hmap.put("Jim", 6);
		hmap.put("Jack", 2);
		hmap.put("Tim", 8);
		hmap.entrySet().stream().forEach(x->{
			System.out.println(" kye : "+ x.getKey() +" value : "+ x.getValue());
		});

		 Set<Entry<String, Integer>> entrySet = hmap.entrySet();

		Iterator<Entry<String, Integer>> itr = entrySet.iterator();

		while (itr.hasNext()) {
			Entry<String, Integer> entry = itr.next();

			System.out.println("Key- " + entry.getKey() + "   value- " + entry.getValue());
		}
	}
}

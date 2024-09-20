package ImpPrograms.collectionPrograms;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashmapTest {
	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(null, "Sam");
		hm.put(null, "Jack");
		hm.put(1, "Jim");
		hm.put(8, null);
		
		System.out.println(hm.size());
		System.out.println(	hm.get(null));
		System.out.println(hm);
		
		//Converting map to synchronized map
		Map<Integer, String> synchronizedMap = Collections.synchronizedMap(hm);
		
	}
}

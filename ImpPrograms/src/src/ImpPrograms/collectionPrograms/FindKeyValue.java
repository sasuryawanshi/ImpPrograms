package ImpPrograms.collectionPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindKeyValue {
public static void main(String[] args) {
	
	Map<Integer,String> map=new HashMap<Integer,String>();
	map.put(4, "Sam");
	map.put(5, "Tim");
	map.put(6, "Jack");
	map.put(8, "Sam");
	
	Set<Entry<Integer, String>> entrySet = map.entrySet();
	Iterator<Entry<Integer, String>> itr = entrySet.iterator();
	while(itr.hasNext()) {
		Entry<Integer, String> obj = itr.next();
		    System.out.print( obj.getKey()+"...");
		    System.out.println( obj.getValue());
	}
}
}

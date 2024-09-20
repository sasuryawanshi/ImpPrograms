package ImpPrograms.collectionPrograms;

import java.util.Collections;
import java.util.HashSet;


public class TestHashSet {
public static void main(String[] args) {
	HashSet<String> hs= new HashSet<>();
	hs.add("apple");
	hs.add("null");
	hs.add("apple");
	hs.add("mango");
	hs.add("mango");
	hs.add("pista");
	System.out.println(hs.size());
	System.out.println(hs);
	Collections.synchronizedSet(hs);
}
}

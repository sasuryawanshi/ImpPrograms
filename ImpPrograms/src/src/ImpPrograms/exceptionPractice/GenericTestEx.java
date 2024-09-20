package ImpPrograms.exceptionPractice;

import java.util.HashSet;

public class GenericTestEx {
public static void main(String[] args) {
	HashSet <String >hs= new HashSet<>();// No compile error comes even type is not provided in generic --new HashSet<>()
	hs.add("Apple");
	hs.add("Mango");
	hs.add("Apple");
	hs.add("AppleMango");
	System.out.println(hs);
}
}

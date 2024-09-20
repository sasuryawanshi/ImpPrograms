package ImpPrograms.collectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraylistTest {
public static void main(String[] args) {
	ArrayList<Integer> al =new ArrayList<Integer>();
	
	al.add(5);
	al.add(6);
	al.add(6);
	al.add(7);
	
	//converting array to synchronized 
	List<Integer> synchronizedList = Collections.synchronizedList(al);
	System.out.println(al);
	
	//passing ArrayList into new ArrayList as object
	//we can do by adAll() method or pass AL object in to constructor of new arraylist
	ArrayList<Integer> bl =new ArrayList<Integer>(al);
	//bl.addAll(al);
	System.out.println(bl);
	
	
}
}

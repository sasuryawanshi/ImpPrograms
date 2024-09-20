package ImpPrograms.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethodUseOfStreams {
public static void main(String[] args) {
	ArrayList<Integer> list= new ArrayList<Integer>();
	list.add(47);
	list.add(20);
	list.add(50);
	list.add(22);
	list.add(66);
	list.add(35);
	//use of map() method of stream API
	//map() used to perform operation on every collection object and return all object. input Obj count=outPut Obj count
	
	//Adding 5  to each above object
	List<Integer> newList = list.stream().map(e->e+5).collect(Collectors.toList());
	System.out.println(newList);
	
	//count() -> How many elements in the stream
	long totalCount = list.stream().count();
	System.out.println(totalCount);
	
	//Perform operation on stream and then count
	long newCount = list.stream().filter(e->e%2==0).count();
	System.out.println(newCount);
}
}

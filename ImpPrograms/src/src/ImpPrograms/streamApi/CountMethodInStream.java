package ImpPrograms.streamApi;

import java.util.ArrayList;

public class CountMethodInStream {
public static void main(String[] args) {
	ArrayList <Integer>list  = new ArrayList<Integer>();
	list.add(50);
	list.add(43);
	list.add(20);
	list.add(25);
	list.add(40);
	long count = list.stream().count();
	System.out.println("Before filter...."+count);
	
long even=	list.stream().filter(x -> x%2 == 0).count();
	System.out.println("After filter....." + even);
double	sumOfEven = list.stream().filter(x -> x% 2 == 0).mapToDouble( i ->i).sum();
	System.out.println("Sum of even no..."+sumOfEven );
}
}

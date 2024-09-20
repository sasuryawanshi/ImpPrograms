package ImpPrograms.streamApi;

import java.util.ArrayList;
import java.util.Comparator;

public class MinAndMaxInStream {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(55);
		list.add(20);
		list.add(57);
		list.add(10);
		list.add(90);
		list.add(96);
		//Find minimum number use comparator and get at the end
		Integer minNumb = list.stream().min((e1,e2)-> e1.compareTo(e2)).get();
		System.out.println(minNumb);
		//Find maximum num
		Integer maxNum = list.stream().max(Comparator.naturalOrder()).get();
		System.out.println(maxNum);
		
	}
}

package ImpPrograms.StringPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseStringByArrayList {
	public static void main(String[] args) {
		// ReverseStringByArrayList a= new ReverseStringByArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ");
		String next = sc.next();
		
		//String str = "ABCD";

		char[] chr = next.toCharArray();
		List <Character>list = new ArrayList<Character>();

		for (char c : chr) {
			list.add(c);
			//System.out.println(list);
		}
		Collections.reverse(list);
		System.out.println(list);
	}

}

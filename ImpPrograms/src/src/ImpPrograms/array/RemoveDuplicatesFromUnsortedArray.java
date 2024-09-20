package ImpPrograms.array;

import java.util.HashSet;

public class RemoveDuplicatesFromUnsortedArray {
	public static void main(String[] args) {
		int[] a = { 2, 1, 3, 8, 6, 6, 5, 7, 8, 8, 0 };
		System.out.println(a.length);

		HashSet<Integer> hs = new HashSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			hs.add(a[i]);
		}
		for (int num : hs) {
			System.out.print(num);

		}

	}
}

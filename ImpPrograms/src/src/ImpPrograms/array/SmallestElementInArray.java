package ImpPrograms.array;

public class SmallestElementInArray {
	public static void main(String[] args) {
		int[] a = { 34, 41, 32, 22, 61, 58, 83 };
		int min = a[0];// Assume element is minimum at zeroth index
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(min);
	}
}

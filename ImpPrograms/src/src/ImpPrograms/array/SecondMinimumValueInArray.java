package ImpPrograms.array;

public class SecondMinimumValueInArray {

	public static void main(String[] args) {

		int[] a = { 2, 5, 1, 4, 7 };
		int min = Integer.MAX_VALUE;
		int sec_min = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == min) {
				sec_min = min;
			}

			else if (a[i] < min) {
				sec_min = min;
				min = a[i];
			}

			else if (a[i] < sec_min)
				sec_min = a[i];
		}
		System.out.println(sec_min);
	}
}

package ImpPrograms.array;

public class ArrayMissingNumber {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 7 };
		int n = arr.length + 1;
		int sum = (n * (n + 1)) / 2;// formula to to find sum of all natural numbers
		for (int i = 0; i < arr.length; i++) {
			// use current length of array in for loop
			sum = sum - arr[i];
		}
		System.out.println("Missing Number= " + sum);
	}

}

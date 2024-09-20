package ImpPrograms.array;

public class FindPairOfArrayIntToGetSumOfThem {
	// Java program to check if there exists a pair
	// in array whose sum is equal to given number.
	//find sum of given target number
	static boolean checkPair(int A[], int size, int sumInt) {
		for (int i = 0; i < (size - 1); i++) {
			for (int j = (i + 1); j < size; j++) {
				if (A[i] + A[j] == sumInt) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[] = { 3, -1, 5, -3, 5, 2, 6 };
		//int sumInt = 10;
		int sumInt=8;
		int size = arr.length;
		if (checkPair(arr, size, sumInt)) {
			System.out.println("Matching element Found");
		} else {
			System.out.println("Not found");
		}
	}
}

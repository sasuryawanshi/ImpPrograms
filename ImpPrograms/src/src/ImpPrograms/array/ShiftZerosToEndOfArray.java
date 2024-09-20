package ImpPrograms.array;

import java.util.Arrays;

public class ShiftZerosToEndOfArray {
	public static void main(String[] args) {
		int arr[] = {0 , 0};
		moveZeroes(arr);
		System.out.println(Arrays.toString(arr));

		// System.out.println(arr);// we can not print array object in java directly in java.
		//  Use Arrays.toString() method to print array it will print hash value

	}

	public static void moveZeroes(int[] nums) {
		int lastNonZeroFoundAt = 0;

		// Traverse the array
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				// Swap non-zero element with the element at lastNonZeroFoundAt
				int temp = nums[i];
				nums[i] = nums[lastNonZeroFoundAt];
				nums[lastNonZeroFoundAt] = temp;
				// Move the lastNonZeroFoundAt pointer to the right
				lastNonZeroFoundAt++;
			}
		}
	}
}

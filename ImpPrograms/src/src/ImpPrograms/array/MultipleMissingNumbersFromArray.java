package ImpPrograms.array;

public class MultipleMissingNumbersFromArray {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 4, 5, 5, 7, 9, 9, 9,12};
		// System.out.println(arr.length);

		int[] newArr = new int[13];// imp-->GIVE new array size=highest number+1(highest number present in given array i.e. 12+1) to match index of new array

		for (int i : arr) {
			// System.out.print(i);
			newArr[i] = 1;
		}
		for (int i = 0; i < newArr.length - 1; i++) {
			if (newArr[i] == 0) {
				System.out.print(i+",");
			}
		}
	}
}

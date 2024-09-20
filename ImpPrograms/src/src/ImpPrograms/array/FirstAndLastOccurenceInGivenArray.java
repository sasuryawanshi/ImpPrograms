package ImpPrograms.array;

public class FirstAndLastOccurenceInGivenArray {
	
	static int findOccurrence(int[] nums, int target) {
		for(int i =0; i < nums.length ;i++){
			if(nums[i] == target)
				return i;
		}
		 return -1;
		
	}
	
	public static void main(String[] args){
		int[] nums = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
		int target = 15;
		int index = findOccurrence(nums, target);
		if (index != -1){
		System.out.println("The first occurrence of element " + target +" is located at index " + index);
		}
		else {
			System.out.println("Element not found in the array");
		}
	}
}

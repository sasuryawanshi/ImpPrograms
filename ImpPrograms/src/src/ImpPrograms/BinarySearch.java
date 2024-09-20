package ImpPrograms;

public class BinarySearch {

    public static void main(String[] args) {
        // sorted array
     int[]  nums = {1,2,9,4};
     int target = 9;
        System.out.println(" index of target " + search(nums,target));
    }

    private static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        while(l <= r){
            int mid = l + (r-l)/2;  // mid  = l + ( r -l) /2
            if(target == nums[mid]){
                return mid;
            }else if(target < nums[mid]){
                r = mid -1;
            }else{
                l = mid + 1;
            }
        }
        return -1;
    }
}

package ImpPrograms;

public class FindPairOfArrayIntToGetSumOfThem {
    public static void main(String[] args) {
        int arr[] = { 3, -1, 5, -3, 5, 2, 6 };
        int [] sorted = {1,2,3,4,5,8};
        int targetSum= 7;
        forUnSortedArray(arr, targetSum);
        forSortedArray(sorted,targetSum);
    }

    private static void forSortedArray(int[] sorted, int targetSum) {
        int low = 0;
        int high = sorted.length-1;

        while(low < high){
            if(sorted[low]+sorted[high] > targetSum){
                high--;
            }else if(sorted[low]+sorted[high] < targetSum){
                low++;
            }else if(sorted[low]+sorted[high] ==  targetSum){
                System.out.println(" "+sorted[low]+" "+sorted[high]);
                high--;
                low++;
            }
        }


    }

    private static void forUnSortedArray(int[] arr, int targetSum) {
        int a = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == targetSum) {
                //   if(a == arr[i]) continue;
                  //  a = arr[i];
                    System.out.println("Pair with sum " + targetSum + ": (" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }
}
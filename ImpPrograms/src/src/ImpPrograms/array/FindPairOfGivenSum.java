package ImpPrograms.array;

public class FindPairOfGivenSum {
    //Find sum of two numbers from given array equal to given (Targeted) number
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,8};
        int sum=5;
        int low=0;
        int high=arr.length-1;
        while (low<high){
            if(arr[low]+arr[high]>sum){
                high--;
            } else if (arr[low]+ arr[high]<sum) {
                low++;
            } else if (arr[low] + arr[high]==sum) {
                System.out.println(arr[low]+","+arr[high]);
                low++;
                high--;
            }
        }
    }
}

package ImpPrograms.array;

import java.util.Arrays;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int [] arr={1,5,3,7,5,5};


       int sum2= Arrays.stream(arr).sum();
        System.out.println("## " + sum2);
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}

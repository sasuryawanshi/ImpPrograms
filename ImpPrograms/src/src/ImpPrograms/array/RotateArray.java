package ImpPrograms.array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int k =3 ; // rotate 3 times
        int[] arr = {1,2,3,4,5,6,7};  // output : [5,6,7,1,2,3,4]
        int n = arr.length;
      //  rotateUsingTempArray(k, n, arr);
        rotateWithOutUsingTempArray(arr,k,n);
        System.out.println(Arrays.toString(arr));

    }

    private static void rotateWithOutUsingTempArray(int[] arr, int k, int n) {
    //    k = k % n; // In case k is larger than n

        // reverse complete array
        reverse(arr, 0, n-1);
        // reverse till k
        reverse(arr, 0, k-1);
        // reverse from k to last array
        reverse(arr, k, n-1);

        System.out.println(" Print rotate With Out Using Temp Array  ");



    }

    private static void reverse(int[] arr, int start, int end) {
        while(start < end){
            int temp = arr[start];
            arr[start] =  arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    private static void rotateUsingTempArray(int k, int n, int[] arr) {
         k =k+1;
        int[] temp =new int[n];
        for(int i = k; i < n; i++ ){
            temp[i- k] = arr[i];
        }

        for(int i = 0; i < k; i++){
            temp[n - k + i ] = arr[i];
        }
        System.out.println(" Print rotate Using Temp Array  ");

    }


}


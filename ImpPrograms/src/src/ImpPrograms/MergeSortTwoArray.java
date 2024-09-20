package ImpPrograms;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSortTwoArray {

    public static void main(String[] args) {

        int[] unsorted = { 2, 1, 4, 3, 6, 5, 7 };
        int[] sorted1  = { 1, 2, 3, 4 };
        int[] sorted2  = { 2, 5, 8, 9 };

        System.out.print("Using java8 : ");

        sortUsingJava8(sorted1, sorted2);
        // merge 2 sorted array
        System.out.println(" ");
        System.out.print("Merging two sorted array : ");
        int[] sorted = merge2(sorted1, sorted2);
        Arrays.stream(sorted).forEach(x -> System.out.print(" " + x));
        System.out.println(" ");
        System.out.print("Sorting array using merge sort : ");
        //for unsorted array
        int[] combinedSorted = mergeSort2(unsorted);
        Arrays.stream(combinedSorted).forEach(x -> System.out.print(" " + x));
    }

    private static int[] mergeSort2(int[] unsorted) {
        if (unsorted.length == 1) return unsorted;

        int mid = unsorted.length / 2;

        int[] left = mergeSort2(Arrays.copyOfRange(unsorted, 0, mid));
        int[] right = mergeSort2(Arrays.copyOfRange(unsorted, mid, unsorted.length));

        return merge2(left, right);
    }

    private static int[] merge2(int[] left, int[] right) {
        int[] combined = new int[left.length + right.length];

        int i = 0; // for left
        int j = 0; // for right
        int index = 0; // for combined

        //this while for adding elements in combined till i or j reaches length on one array
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                combined[index] = left[i];
                index++;
                i++;
            } else {
                combined[index] = right[j];
                index++;
                j++;
            }
        }
//this while for adding elements in combined from left if i is not reached length of left
        while (i < left.length) {
            combined[index] = left[i];
            index++;
            i++;
        }
        //this while for adding elements in combined from right if j is not reached length of right
        while (j < right.length) {
            combined[index] = right[j];
            index++;
            j++;
        }
        return combined;
    }


    private static void sortUsingJava8(int[] arr1, int[] arr2) {
        IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).distinct().sorted().forEach(x -> System.out.print(" " + x));
    }


}


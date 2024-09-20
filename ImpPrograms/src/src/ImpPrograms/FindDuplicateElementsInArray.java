package ImpPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class FindDuplicateElementsInArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 4, 5, 6, 5 };
//        usingSet(arr);
//        withoutUsingSet(arr);
        usingJava8(arr);

    }

    private static void usingJava8(int[] arr) {
        Set<Integer> uique=new HashSet<>();
        // Set<Integer> distinct = new HashSet<>();
       // Set<Integer> collect =
                Arrays.stream(arr).boxed().filter(x -> !uique.add(x)).forEach(x -> System.out.println(" "+x));//.collect(Collectors.toSet());
    }

    private static void withoutUsingSet(int[] arr) {
            for(int i =0; i<arr.length-1; i++) {

                for (int j = i+1; j < arr.length ;j++){
                    if(arr[i]==arr[j]){
                        System.out.print(" " +arr[i]);
                    }
                }
            }
    }

    private static void usingSet(int[] arr) {
        Set<Integer> set=new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            if(!set.add(arr[i])){
                System.out.print(" "+ arr[i]);
            }
        }
    }
}

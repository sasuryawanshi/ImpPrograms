import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
        String ssd= " SS SS DD FF DD ";
        Map<String,Long>  countOfString = Arrays.stream(ssd.trim().split(" "))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

     System.out.println("countOfString "+countOfString);

        int [] arr = {2,3,5,7,1,4,9,1,5,2,3};



        Set<Integer> unique =new HashSet<>();
        List<Integer> list= new ArrayList<>();
        for(int ss : arr){
            if(!unique.add(ss)){
             list.add(Integer.valueOf(ss));
            }
        }

        int[] newArr = new int[unique.size()];

        int[] newArrDuplicate=new int[list.size()];
            int i = 0;
        for(Integer b : unique){
            newArr[i++] =b;
        }

        int j = 0;
        for(Integer d : list){
            newArrDuplicate[j++] =d;
        }

        System.out.println(" unique " +Arrays.stream(newArr).boxed().toList());
        System.out.println("Duplicate "+Arrays.stream(newArrDuplicate).boxed().toList());

    /*  // reverse
        int num = 12345;
           String  str = String.valueOf(num);

        String str1 = "sachin";

        for(int i = str.length()-1; i >= 0; i-- ){
            System.out.print(str.charAt(i));
        }

        int [] arr = {2,3,5,7,1,4,9};

        for (int i=0; i < arr.length; i++){
// odd even
    if(arr[i] % 2 == 0){
         System.out.println(" even  "+arr[i]);
    }else{
     System.out.println(" odd  "+arr[i]);
    }
        }
//sort
        for (int i=0; i < arr.length; i++){

            for (int j = i+1; j < arr.length; j++){
                int temp =0;
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    */}

}

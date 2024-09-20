package ImpPrograms;

public class ReverseString {
public static void main(String[] args) {
    String ss = "abcd";
    System.out.println(revString(ss));

    //Swap 2 string without using third variable
    String s1 = "xyz";
    String s2 =  "mnp";

     s1 = s1 +s2;
     s2 = s1.substring(0,s1.length()-s2.length());
     s1 = s1.substring(s2.length());

    System.out.println("s2 "+ s2);

    System.out.println("s1 "+ s1);


}

    private static StringBuilder revString(String ss) {
        StringBuilder rev = new StringBuilder();
        for(int i= ss.length()-1; i>=0;i--){
            rev.append(ss.charAt(i));
        }
        return rev;
    }

}


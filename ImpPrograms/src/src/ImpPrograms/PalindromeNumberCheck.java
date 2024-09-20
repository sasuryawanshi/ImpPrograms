package ImpPrograms;

import java.util.PriorityQueue;

public class PalindromeNumberCheck
{
    public static void main(String[] args) {

        System.out.println("Number 12321 is Palindrome " + isPalindrome(12321));

        PriorityQueue<Integer> p = new PriorityQueue();
        p.add(11);
        p.add(10);
        p.add(20);
        p.add(26);
        p.add(3);
        p.add(55);

        System.out.println("MMMMMM "+p);

        while (p.isEmpty() == false) {
            System.out.print(" "+String.valueOf(p.remove()));
        }
    }

    private static boolean isPalindrome(int n) {
       String strNum = String.valueOf(n);
       String rev= "";
     for(int i= strNum.length()-1; i >= 0; i--){
         rev = rev + strNum.charAt(i);
     }
        System.out.println(" reverse " + rev);
     if(rev.equals(strNum)) return true;

     return false;
    }
}

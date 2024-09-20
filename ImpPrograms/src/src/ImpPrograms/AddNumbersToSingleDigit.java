package ImpPrograms;

public class AddNumbersToSingleDigit {

    public static void main(String[] args) {
            String s= "88";
            int n = Integer.parseInt(s);
        System.out.println("add Digits In Single Digit " +addDigitsInSingleDigit(n));
        System.out.println("Sum digits of the number "+ sumDigits(n)); // ( n % 9 == 0) ? 9 : ( n % 9);
    }

    private static int sumDigits(int n) {
        if(n == 0) return 0;
    String str = String.valueOf(n);
    int sum = 0;
    for(Character x : str.toCharArray()){
        sum =  sum + Integer.parseInt(String.valueOf(x));
    }
    return sum;
    }

    //if need final single digit from all sum output
   static int addDigitsInSingleDigit(int n){
        if(n == 0) return 0;
       return ( n % 9 == 0 ) ? 9 : ( n % 9 );
   }
}

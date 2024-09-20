package ImpPrograms;

public class Factorial
{
    public static void main(String[] args) {

        System.out.println("Factorial of 7 "+ getFactorial(7));
    }

    private static long getFactorial(int n) {
        if(n == 1) return 1;
        return n * getFactorial(n-1);
    }
}

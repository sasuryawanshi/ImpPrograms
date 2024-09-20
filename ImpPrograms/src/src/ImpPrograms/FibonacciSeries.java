package ImpPrograms;

public class FibonacciSeries {
    public static void main(String[] args) {
        printFibonacciSeries(15);
    }

    private static void printFibonacciSeries(int n) {
        int a = 0;
        System.out.print(" "+a);
        int b = 1;
        System.out.print(" "+b);
        int c;

        for (int i =0; i<=n; i++){
            c = a+b;
            System.out.print(" "+c);
            a = b;
            b = c;
        }
    }
}

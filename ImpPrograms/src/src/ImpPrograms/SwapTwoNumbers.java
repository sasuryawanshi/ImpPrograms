package ImpPrograms;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        int a = 100;
        int b = 70;

        a = a+b;
        b = a-b;
        System.out.println("b "+b);
        a = a-b; // now b is a i.e 70
        System.out.println("a "+a );

    }
}

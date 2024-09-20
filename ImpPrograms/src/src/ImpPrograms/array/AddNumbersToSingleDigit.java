package ImpPrograms.array;

public class AddNumbersToSingleDigit {
    static int digitSum(int number){     //O(1)
        if (number==0)
            return 0;
            return (number % 9 == 0) ? 9:(number % 9);
    }

    public static void main(String[] args) {
        int number=18;
        int ans = ( number % 9 == 0) ? 9 : (number % 9);
        System.out.println( ans);
        System.out.println(digitSum(number));
    }

}

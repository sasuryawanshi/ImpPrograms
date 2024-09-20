package ImpPrograms.array;

public class SecondhighestNumberInArray {

    public static void main(String[] args) {
        int[] a = {5, 6, 8, 7, 3, 2,9};
        int largest = 0;
        int secondlargest = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                secondlargest = largest;
                largest = a[i];
            } else if (a[i] > secondlargest) {
                secondlargest = a[i];
            }
        }
        System.out.println(secondlargest);
    }
}

package ImpPrograms.array;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] a = {8, 7, 2, 5, 9, 3, 1};
        int[] b = {10, 20, 50, 70};
        int a_length = a.length;
        int b_length = b.length;
        int c_length = a_length + b_length;
        int[] c = new int[c_length];
        //System.out.println(c.length);
        int index = 0; // for combined array
        for (int i = 0; i < a_length; i++) {
            c[index] = a[i];
            index++;
        }
        for (int j = 0; j < b_length; j++) {
            c[index] = b[j];
            index++;
        }

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}

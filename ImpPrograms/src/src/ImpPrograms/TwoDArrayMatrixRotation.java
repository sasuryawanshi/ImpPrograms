package ImpPrograms;

public class TwoDArrayMatrixRotation
{
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}

        };
        rotateArray(arr);
        System.out.println("###########  " );
        System.out.println("Print after Rotate  " );
        printArr(arr);
    }

    private static void rotateArray(int[][] arr) {
        transposeArr(arr);
        System.out.println("Print after Transpose " );
        printArr(arr);
        reverseArray(arr);
    }

    private static void reverseArray(int[][] arr) {
        for(int i=0; i< arr.length; i++){
            int left =0;
            int right = arr.length -1;
            while(left < right){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left ++;
                right--;
            }
        }

    }

    private static void transposeArr(int[][] arr) {
        for(int i = 0;i<arr.length;i++){
            for(int j =i;j< arr.length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    private static void printArr(int[][] arr) {
        for(int[] row : arr){
            for(int value: row){
                System.out.print(value+ " ");
            }
            System.out.println();
        }
    }
}

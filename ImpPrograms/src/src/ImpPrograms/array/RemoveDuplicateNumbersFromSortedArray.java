package ImpPrograms.array;

public class RemoveDuplicateNumbersFromSortedArray {
	
	public static void main(String[] args) {
		int [] arr= {2,3,4,6,6,7,8,8};
		int [] newArr= new int [arr.length];
		int j=0;
		for (int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				newArr[j]=arr[i];
				j++;
			}
		}
		newArr[j]=arr[arr.length-1];//add remaining element directly to new arrays last position
		for(int i=0;i<newArr.length;i++) {
			System.out.print(newArr[i]+"  ");
		}
	}

}

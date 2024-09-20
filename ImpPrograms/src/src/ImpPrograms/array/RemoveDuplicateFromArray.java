package ImpPrograms.array;
import java.util.HashSet;

public class RemoveDuplicateFromArray {
	
	public static void main(String[] args) {
		int[] arr = { 5, 6, 7, 3, 3, 9, 6, 4, 4 };
		HashSet<Integer> hset = new HashSet<Integer>();
	
		for (int i = 0; i < arr.length; i++) {
			hset.add(arr[i]);
		}
		for (Integer s : hset) {
			System.out.print(s + " ");
		}
		
		//Arrays.stream(arr).distinct().forEach(System.out::print);
		
	}

	/* OR
	 * Set <Integer> set= new HashSet();
	 * for( Integer num:a){
	 *  set.add(num);
	 * }System.out.print(set);
	 */
}

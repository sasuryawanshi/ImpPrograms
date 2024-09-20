package ImpPrograms.collectionPrograms;

public class IteratingHashMap {
	
	public static void main(String[] args) {
		//Fibonacci series  - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
		
		int a=0;
		int b=1;
		int c=0;
		
		for (int i=0;i<5 ;i++){
		     c=a+b;
			 System.out.println(c);
		     a=b;
		     b=c;
			 
		}
	}

}

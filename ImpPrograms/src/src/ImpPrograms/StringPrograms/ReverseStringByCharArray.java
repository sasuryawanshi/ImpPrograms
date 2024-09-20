package ImpPrograms.StringPrograms;

public class ReverseStringByCharArray {
	public static void main(String[] args) {
		String str="abcde";
		char[] charArray = str.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			System.out.print(charArray[i]);
		}
	}
}

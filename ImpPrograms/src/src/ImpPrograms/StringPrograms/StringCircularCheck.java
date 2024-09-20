package ImpPrograms.StringPrograms;

public class StringCircularCheck {
	public static void main(String[] args) {
		String str = "ABC";
		String str1 = "PQABCHK";
		
		str = str + str1;
		if (str.contains(str1)) {
			System.out.println("Circular");
		} else
			System.out.println("Non Circular");
	}
}

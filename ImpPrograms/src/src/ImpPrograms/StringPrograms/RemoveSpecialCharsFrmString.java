package ImpPrograms.StringPrograms;

public class RemoveSpecialCharsFrmString {

	public static void main(String[] args) {
		String str = "@Sushil,@kumar#.jadhav#palus.$$";
		String normal = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("By removing only special chars and punctuation");// Give punctuation to keep in regular
																				// expression (regex)
		System.out.println(normal);
	}
}

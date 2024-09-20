package ImpPrograms.StringPrograms;

public class RemoveSpecialCharsKeepPunctuationString {

	public static void main(String[] args) {
		String str= "@Sushil,@kumar#.jadhav#palus.$$";
		
				String normal=str.replaceAll("[^,.a-zA-Z0-9]","");//Give punctuation to keep in regular expression (regex)
				System.out.print("By removing only special chars    "+normal);
	}
}

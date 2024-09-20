package ImpPrograms.StringPrograms;

public class CheckStrings {

	public static void main(String[] args) {
		String s1="ABC";
		String s2=s1;
		s1 +="d";
		System.out.println(s1+"......."+s2+""+(s1==s2));
		StringBuffer sb1= new StringBuffer("ABC");
		StringBuffer sb2=sb1;
		sb1.append("d");
		System.out.println(sb1+"......."+sb2+""+(sb1==sb2));
	}
}

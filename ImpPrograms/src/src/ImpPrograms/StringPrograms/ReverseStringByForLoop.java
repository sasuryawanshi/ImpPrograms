package ImpPrograms.StringPrograms;

public class ReverseStringByForLoop {
public static void main(String[] args) {
	String str="abcde";
	System.out.println("Length of String.."+str.length());
	String rev="";
	char ch;
	for(int i=0;i<str.length();i++) {
		//using char at method
		ch=str.charAt(i);
		rev=ch+rev;
	}
	System.out.println("Reverse String.."+rev);
	//str.chars().mapToObj(e->(char) e).sorted((e1,e2)->e2.compareTo(e1)).forEach(System.out::print);--is is only for sequential chars in word
}
}

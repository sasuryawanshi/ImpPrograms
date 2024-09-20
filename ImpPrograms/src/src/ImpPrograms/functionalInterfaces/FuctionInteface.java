package ImpPrograms.functionalInterfaces;

import java.util.function.Function;

public class FuctionInteface {
public static void main(String[] args) {
	//remove spaces from the given string
	
	String str="I am the Boss";
	Function<String, String> function=k->k.replace(" ","");
	
	String apply = function.apply(str);
	System.out.println(apply);
}
}

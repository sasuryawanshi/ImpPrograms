package ImpPrograms.functionalInterfaces;

import java.util.function.Supplier;

public class Supplierinterface {
public static void main(String[] args) {
	Supplier< String> spr=()->{
		String [] str= {"Sam","Kim","Jack"};
		int x=(int) (Math.random()*2);
		return str[x];
	};
	System.out.println(spr.get());
	System.out.println(spr.get());
	System.out.println(spr.get());
	System.out.println(spr.get());
}
}

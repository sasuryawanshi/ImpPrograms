package ImpPrograms.streamApi;

import java.util.Arrays;
import java.util.List;

public class SumOddOrEvenNums {
	

	public void m() {
		
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 6, 3, 8, 9, 5);
		int sum = list.stream().filter(i -> i % 2 == 0).mapToInt(i -> i).sum();
		System.out.println(sum);
		int sum2 = list.stream().filter(i-> i%3==0).mapToInt(i->i).sum();
		System.out.println(sum2);
		
		//Another way of summing data if given multiple values in object
		//Integer collect2 = list.stream().collect(Collectors.summingInt(Company::getEmpCount));
		//System.out.println(collect2);
	
	}
}

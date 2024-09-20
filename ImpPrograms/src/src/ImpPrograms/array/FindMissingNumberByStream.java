package ImpPrograms.array;

import java.util.Arrays;

public class FindMissingNumberByStream {
public static void main(String[] args) {
	int [] list= {4,5,3,6,2};
	int actualSum=Arrays.stream(list).sum();
	int maxVal = Arrays.stream(list).sorted().max().getAsInt();
	int expectedSum=maxVal*(maxVal+1)/2;
	int missingNo=expectedSum-actualSum;
	System.out.println(missingNo);
	
}
}

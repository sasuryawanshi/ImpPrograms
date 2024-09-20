package ImpPrograms.streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecodHighestStringNumber {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("12","34"," ","4", "3" ,"5", null);

        Integer secondHighest = list.stream().filter(x -> null != x && x != " ").map(y -> Integer.parseInt(y)).
                sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        System.out.println(" secondHighest "+ secondHighest);

        Integer secondLowest = list.stream().filter(x -> null != x && x != " ").map(y -> Integer.parseInt(y)).
                sorted().skip(1).findFirst().get();

        System.out.println(" secondLowest "+ secondLowest);

    }



}

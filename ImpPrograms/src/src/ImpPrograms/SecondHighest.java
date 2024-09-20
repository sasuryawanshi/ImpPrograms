package ImpPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighest {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1", "2", "50", null, " ", "36", "0", "-27");

        List<Integer> integers = Arrays.asList(1, 2, 50, null, 36, 0, -27);

        String secondHighest = strings.stream()
                .filter(x -> null != x && x != " ")
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println("when string list " +secondHighest);

        Integer secondHighestInteger = integers.stream().filter(x -> x != null)
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println("when Integers list " +secondHighestInteger);
    }
}

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestCognizant {
    public static void main(String[] args) {

        //Printing repeating characters of string
                System.out.println("Run method called.");
                String ss = "Java Hungry Blog Alive is Awesome";
                String collect  = ss.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .entrySet().stream()
                        .filter( characterLongEntry -> characterLongEntry.getValue() >1)
                        .map(Map.Entry::getKey)
                        .map(String::valueOf)
                        .collect(Collectors.joining());

                System.out.println("collect "+collect);

    }
}

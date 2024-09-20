package ImpPrograms.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toCollection;

public class StreamCollectionOperations {
    public static void main(String[] args) {
        Company c1 = new Company(121, "Wipro", 22000);
        Company c2 = new Company(122, "HCL", 30000);
        Company c3 = new Company(131, "TECHM", 15000);
        Company c4 = new Company(151, "IBM", 32000);
        Company c5 = new Company(135, "IBM", 32000);

        List<Company> list = Arrays.asList(c1, c2, c3, c4, c5);

        // convert list to Collection Map( map-key and map value) by cid and name
        Map<Integer, String> mp = list.stream().collect(Collectors.toMap(Company::getcId, Company::getcName));
        System.out.println(mp);
        // create list from stream as per given condition--make list of company names
        List<String> names = list.stream().map(Company::getcName).collect(Collectors.toList());
        System.out.println(names);
        // Save values to TreeSet
        TreeSet<String> collect = list.stream().map(Company::getcName).collect(toCollection(TreeSet::new));
        System.out.println(collect);

    }
}

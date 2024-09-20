package ImpPrograms.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndFlatmap {
public static void main(String[] args) {
	Stream<String> str = Stream.of("a","b","c","d");
	
	List<String> collect = str.map(i->i+i).collect(Collectors.toList());
	
	
	System.out.println(collect);
	
	List<String> productlist1 = Arrays.asList("Printer", "Mouse", "Keyboard", "Motherboard");  
	List<String>  productlist2 = Arrays.asList("Scanner", "Projector", "Light Pen");  
	List<String> productlist3 = Arrays.asList("Pen Drive", "Charger", "WIFI Adapter", "Cooling Fan");  
	List<String> productlist4 = Arrays.asList("CPU Cabinet", "WebCam", "USB Light", "Microphone", "Power cable");  
	List<List<String>> allproducts = new ArrayList<List<String>>();   
	//adding elements to the list  
	allproducts.add(productlist1);  
	allproducts.add(productlist2);  
	allproducts.add(productlist3);  
	allproducts.add(productlist4);
	List<String> flatMapList = allproducts.stream().flatMap(ll -> ll.stream()).collect(Collectors.toList());
	System.out.println(flatMapList);

Optional<List<String>>	opsList= Optional.ofNullable(productlist1);

opsList.ifPresent(System.out::println);

opsList.orElse(null);


}
}

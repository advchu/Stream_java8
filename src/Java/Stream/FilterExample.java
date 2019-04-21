package Java.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterExample {
	
	public static void main(String[] args) {
		
		// imprative Style 
		List<String> names= Arrays.asList("Ankit Singh","Ram","babu","shyam");
		for (String name:names) {
			if(!name.equals("Ram")) {
				System.out.println(name);
			}
		}
		
		// Funcional  Style 
		names.stream().filter(
				new Predicate<String>() {
					public boolean test(String name) {return !name.equalsIgnoreCase("ram");}
				}
				).forEach(name -> System.out.println(name));
		
		
		
		names.stream().filter( name -> !name.equals("Ram"))
		              .forEach(System.out::println);
				
		
		
		names.stream().filter(FilterExample::isNotRam)
		.forEach(System.out::println);
		
	}
	
	private static boolean isNotRam(String name) {
		return !name.equals("Ram");
	}

}

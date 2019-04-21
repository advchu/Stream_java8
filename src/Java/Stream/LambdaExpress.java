package Java.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LambdaExpress {
	
	public static void main(String [] arg) {
		 
		System.out.println("Creating:::::::::-");
		Game footballLam=()-> System.out.println("I am playing Football");;
		footballLam.play();
		
		Series odiSeries=(s)-> System.out.println("I am playing Series"+s);
		odiSeries.play("Ankit Series");
		
		
		List<String> playesrs =Arrays.asList("Kohli","Sachin","Bhuneshwar","Dravid");
		playesrs
		.stream()
		.filter(player -> player.contains("Sachin"))
		.forEach(play -> System.out.println("Sachin is playing") );
		
		// True & false 
		
		Optional<String> sachin = playesrs
		.stream()
		.filter(player -> player.contains("Sachin")).findFirst();
		
		if(sachin.isPresent()) {
			System.out.println("Yes");
		}
		
	}
	
	interface Game{
		void play();
	}
	
	interface Series{
		void play(String type);
	}

}

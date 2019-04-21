package Java.Stream;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Files {
	
	public static void main (String [] arg) throws IOException {
		
		List<String> strList = java.nio.file.Files.lines(
				Paths.get("/Users/ankitsingh/Documents/WorkSpace/Stream_java8/pom.xml"))
			   .filter(line -> line.contains("name"))
			   .map(line -> {
			     String abc = line.trim().replaceAll("name", "")
			                      .replaceAll("<", "")
			                      .replaceAll(">", "")
			                      .replaceAll("/", "") ;
			                      return abc;
			   })
			   .collect(Collectors.toList());
		System.out.println(strList);
	}
}

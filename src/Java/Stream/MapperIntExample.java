package Java.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MapperIntExample {
	


    public static void main(String[] args) {

        List<String> names = Arrays.asList("Peter", "Sam", "Greg", "Ryan");
        System.out.println("Imperative Style: ");

        for (String name : names) {
            if (!name.equals("Sam")) {
                User user = new User(name);
                System.out.println(user);
            }
        }

        System.out.println("Functional Style: ");

        names.stream()
                .filter(MapperIntExample::isNotSam)
                .map(User::new)
                .forEach(System.out::println);

        List<User> userList = names.stream()
                .filter(MapperIntExample::isNotSam) // Filer Apply for the filtering the object
                .map(User::new) // Mapper is funcinal interface which is convert the object x Object to Y object or X to X object
                .collect(Collectors.toList()); // Collect ans colletors calss is the cass where we can convert the object in multiple Data structure 
        // like list object or map object and so on
        int sumage=userList.stream().mapToInt(user-> user.getAge()).sum(); // Sum Or Terminal Operation 
        
        System.out.println("All Sum "+sumage);

    }

    private static boolean isNotSam(String name) {
        return !name.equals("Sam");
    }


    static class User {
        private String name;
        private Integer age = 30;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "name : " + name + " age : " + age;
        }
    }
	
	
	
	
}

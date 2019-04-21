package Java.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FlatMapExample {
	


    public static void main(String[] args) {

        List<User> users = Arrays.asList(
        		new User ("peter",20,Arrays.asList("1","2")),
        		new User ("peter1",40,Arrays.asList("3","4","9")),
        		new User ("peter2",50,Arrays.asList("5","6")),
        		new User ("peter3",60,Arrays.asList("7","8"))
        		);
System.out.println("Functional Style::::");
        
       Optional<String> filternumber = users.stream()
             .map(user -> user.getPhoneno().stream())
             .flatMap(stream1 -> stream1.filter(number -> number.equals("7")))
             .findAny();
       filternumber.ifPresent(System.out::println);

    }

 
    static class User {
        private String name;
        private Integer age = 30;
        private List<String> phoneno;

        public User(String name, Integer age, List<String> phoneno) {
			this.name = name;
			this.age = age;
			this.phoneno = phoneno;
		}

		public List<String> getPhoneno() {
			return phoneno;
		}

		public void setPhoneno(List<String> phoneno) {
			this.phoneno = phoneno;
		}

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

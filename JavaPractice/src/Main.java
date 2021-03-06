
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class Main {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("ali", Gender.MALE),
                new Person("alikhan", Gender.MALE),
                new Person("alibaba", Gender.MALE),
                new Person("noor", Gender.FEMALE),
                new Person("noorbibi", Gender.FEMALE),
                new Person("noorgul", Gender.FEMALE),
                new Person("noorbano", Gender.FEMALE)

        );


        //Imperative approach
        System.out.println("Imperative approach");
        List<Person> females = new ArrayList<>();

        for (Person person : people){
            if(Gender.FEMALE.equals(person.gender))
                females.add(person);
        }
        for(Person female:females){
            System.out.println(female);
        }
        
        //Declarative approach
        System.out.println("Declarative approach");
        
        
        
        List<Person> females1 = people.stream()
        		.filter(person -> Gender.FEMALE.equals(person.gender))
        		.collect(Collectors.toList());
        females1.forEach(System.out::println);
        
      //  people.stream().filter(person -> Gender.FEMALE.equals(person.gender)).forEach(System.out::println);
        
        
        
        
    }

        static class Person {
            private final String name ;
            private final Gender gender;

            Person(String name, Gender gender){

                this.name = name;
                this.gender= gender;

            }

            @Override
            public String toString() {
                return "Person{" +
                        "name='" + name + '\'' +
                        ", gender=" + gender +
                        '}';
            }
        }
        enum Gender{
        MALE, FEMALE;
        }


}

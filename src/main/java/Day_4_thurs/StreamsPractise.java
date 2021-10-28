package Day_4_thurs;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsPractise {

    /////Using Stream functions to sort and filter a list

    public enum Gender {
        MALE, FEMALE, OTHER
    }

    public static class Individual {
        String name;
        Gender gender;


        public Individual(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
    }

// ABove is just all the construction needed for the Individual class and the list

    public static void streams() {

        List<Individual> people = List.of(

                new Individual("Karen", Gender.FEMALE),
                new Individual("Fred", Gender.MALE),
                new Individual("Greg", Gender.MALE),
                new Individual("Sharon", Gender.FEMALE),
                new Individual("Phil", Gender.MALE),
                new Individual("Sarah", Gender.FEMALE),
                new Individual("Emma", Gender.FEMALE)

        );

        List<String> females = people.stream()
                .filter(p -> p.gender.equals(Gender.FEMALE))
                .map(p -> p.name)
                .map(name -> name.toUpperCase())
//                .limit(1)
                .collect(Collectors.toList());

        females.forEach(System.out::println);

    }
}
///////////////////////////////////////////////////////////////////////////////////////////////
/////   Then the list is created and using .Stream .filter .map .collect the data can be extracted
// (NOTE: the limit is used if only a certain amount of results are desired... limit(1) produces only one result for example




package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.example.Main.Gender.FEMALE;
import static org.example.Main.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(new Person("Bob", MALE),
                new Person("Irishka", FEMALE),
                new Person("John", MALE),
                new Person("Klara", FEMALE),
                new Person("Sasha", FEMALE));

//        imperative approach
//
//        List<Person> female = new ArrayList<>();
//        for (Person person : people) {
//            if (FEMALE.equals(person.gender))
//                female.add(person);
//        }
//
//        for (Person females : female) {
//            System.out.println(females);
//        }

//        declarative approach

        List<Person> females = people.stream().filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList());
        females.forEach(System.out::println);
    }

    static class Person {
        private String name;
        private Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE;
    }
}
package org.example.streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(new Person("Bob", Gender.MALE),
                new Person("Irishka", Gender.FEMALE),
                new Person("John", Gender.MALE),
                new Person("Klara", Gender.FEMALE),
                new Person("Sasha", Gender.FEMALE));

        //Все что юзается в этих стрикам внизу, ипоьзует в себе все те функционаьные интерфейсы которые  нахдятся в библиотеке и которые мы разбирали ранее Function, Consumer, Prediicate, Supplier и тд
//        people.stream().map(person -> person.gender)      //мапа принимает те поля по которым проиходит отбор
////                .mapToInt(String::length).              //эта строка, к примеру, отпечатала бы количество символов в каждом слове
//                .collect(Collectors.toSet())             //то отобранное мы помещаем в новый туташний внутренний лист чего хочется(будь то листы,сеты, мапы)
//                .forEach(System.out::println);           //так делаем распечатку, либо перед стримом помещаем эту функцию в новую переменную типа List<Person> newList = people().stream.....

        Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.gender);       //пример проверки на содержание чеголибо в листе
        boolean containFemail =people.stream().anyMatch(personPredicate);
        System.out.println(containFemail);
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

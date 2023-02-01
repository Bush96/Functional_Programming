package org.example.finalsection;

import java.util.function.Consumer;

public class Callback {
    public static void main(String[] args) {
//CALLBACK - Суть обратного вызова состоит в том, что мы создаем действия, которые вызываются при других действиях, и все это в одной функции
        hello("Daria", null, value -> System.out.println(value+" do not input last name"));
    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }
}

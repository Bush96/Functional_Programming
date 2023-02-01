package org.example.optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        кайф опшинола в том что он может как содержать обьект так и ничего не содержать, быть нулом
        Object value = Optional.ofNullable(null).orElseGet(()->"Default value");  //orElseThrow - можно так же выбросить исключение и еще кучу всего
        System.out.println(value);

        Optional.ofNullable(null)
                .ifPresentOrElse(email-> System.out.println("You send" + email), ()-> System.out.println("Can not send email"));   //еще один пример широкого использования
    }
}

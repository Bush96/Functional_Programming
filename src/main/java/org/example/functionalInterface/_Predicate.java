package org.example.functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        ////  NON FUNCTION WAY
        System.out.println(isPhoneNumberValid("070000"));
        System.out.println(isPhoneNumberValid("080000"));

        //     Predicate Functional Interface
        System.out.println(isPhoneNumberValidWithPredicate.test("070000"));
        System.out.println(isPhoneNumberValidWithPredicate.test("080000"));

        System.out.println(isPhoneNumberValidWithPredicate.and(isPhoneNumberContainNumber8).test("070080"));     //предикаты как и другие функ интерфейсы можно обединять
    }

    ////  NON FUNCTION WAY
    static boolean isPhoneNumberValid(String msg) {
        return msg.startsWith("07") && msg.length() == 6;
    }

    //     Predicate Functional Interface
    static Predicate<String> isPhoneNumberValidWithPredicate = phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 6;
    static Predicate<String> isPhoneNumberContainNumber8 = phoneNumber -> phoneNumber.contains("8");

}

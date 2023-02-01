package org.example.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int incrementByOne = incrementByOne(1);
        System.out.println(incrementByOne);
//Function
        int incrementByFunction = incrementWithFunction.apply(1);       //.apply - используем с функцией, функция - 1 аргумент 1 рзультат
        System.out.println(incrementByFunction);

        int incrementThanMultiply = incrementWithFunction
                .andThen(multiplyBy10WithFunction).apply(1);          //существенный плюс в этом примере отфункции это обьединение действий в последовательную строку что делает код чище
        System.out.println(incrementThanMultiply);
//BiFunction
        int biIncrementAndMultiply = incrementByOneAndMultiplyBy.apply(1,10);                //би функция проводит операции с двумя аргументами, функция - 2 аргумента 1 рзультат
        System.out.println(biIncrementAndMultiply);
    }

    static Function<Integer, Integer> incrementWithFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyBy10WithFunction = number -> number * 10;

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBy =
            (incrementTo, multiplyTo) -> ((incrementTo + 1) * multiplyTo);                       //би функция проводит операции с двумя аргументами


    //NON FUNCTIONAL WAYS
    static int incrementByOne(int i) {
        return i + 1;
    }                                                         //withoutFunction

    static int incrementByOneAndMultiplyBy(int increment, int numberForMultiply) {
        return (increment + 1) * 10;                        //withoutFunction
    }
}

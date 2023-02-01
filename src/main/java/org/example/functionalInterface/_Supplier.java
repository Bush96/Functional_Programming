package org.example.functionalInterface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {

        System.out.println(getDBConnectionUrl());

        System.out.println(getDbConnectionUrlWithSupplier.get());
    }
    ////  NON FUNCTION WAY
    static String getDBConnectionUrl(){
        return "jdbc:localhost8080";
    }
    //     Supplier Functional Interface
    static Supplier<String> getDbConnectionUrlWithSupplier = () -> "jdbc:localhost8080";
//    эта функция хороша тем что может возвращать все что угоно любого типа, листы, ваши обьекты и т.п.
}

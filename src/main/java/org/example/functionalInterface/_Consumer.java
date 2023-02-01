package org.example.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        Customer maria = new Customer("Bella", "432413253");

//  NON FUNCTION WAY
        greetCustomer(maria);

//        Consumer Functional Interface
        greetCustomerByFunction.accept(maria);

//        BiConsumer Functional Interface
        greetBiCustomerByFunction.accept(maria, false);

    }


    //        Consumer Functional Interface
    static Consumer<Customer> greetCustomerByFunction = customer -> {
        System.out.println("Hello " + customer.customerName + ", thanks for registration phone " + customer.customerPhone);
    };

    //        BiConsumer Functional Interface
    static BiConsumer<Customer, Boolean> greetBiCustomerByFunction = (customer, showPhoneNumber) -> {
        System.out.println("Hello " + customer.customerName + ", thanks for registration phone " + (showPhoneNumber ? customer.customerPhone : "*****"));
    };

    //  NON FUNCTION WAY
    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + ", thanks for registration phone " + customer.customerPhone);
    }

    static void greetCustomerV2(Customer customer, Boolean boo) {
        System.out.println("Hello " + customer.customerName + ", thanks for registration phone " + (boo ? customer.customerPhone : "*****"));
    }


    static class Customer {
        private String customerName;
        private String customerPhone;


        public Customer(String customerName, String customerPhone) {
            this.customerName = customerName;
            this.customerPhone = customerPhone;
        }


    }

}

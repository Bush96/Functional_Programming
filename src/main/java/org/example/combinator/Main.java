package org.example.combinator;

import java.time.LocalDate;

import static org.example.combinator.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Arishka",
                "arishkamail.com", "+334523523", LocalDate.of(2000, 2, 1));
//WITHOUT COMBINATOR
        System.out.println(new CustomersValidatorService().isValid(customer));

//        из названия и следует что мы можем комбинировать наши валидации намного проще чем без него в CustomerRegistrationValidator
//    WITH COMBINATOR
       ValidationResult result = isEmailValid().
                and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer );

        System.out.println(result);
        if(result !=ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }
    }



}

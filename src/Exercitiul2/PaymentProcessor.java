package Exercitiul2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public interface PaymentProcessor {

    boolean processPayment(double amount);

    static double convertCurrency(double amount, double exchangeRate) {

        if(exchangeRate<=0) {
            throw new IllegalArgumentException( "ExchangeRate Must be positive");
        }
        return amount * exchangeRate;
    }

    default void logTransaction(String transactionDetails) {
        String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        System.out.println(timeStamp + " " + transactionDetails);

    }

}



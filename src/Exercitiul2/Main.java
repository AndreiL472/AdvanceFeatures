package Exercitiul2;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor creditCard = new CreditCardProcessor();
        PaymentProcessor paypal = new PayPalProcessor("user@example.com");

        creditCard.processPayment(1000);
        creditCard.processPayment(4900);
        creditCard.processPayment(-20);

        paypal.processPayment(50);
        paypal.processPayment(-10);


        double converted = PaymentProcessor.convertCurrency(100,1.1);
        System.out.println("Converted currency $" + converted);
        creditCard.processPayment(converted);
    }
}

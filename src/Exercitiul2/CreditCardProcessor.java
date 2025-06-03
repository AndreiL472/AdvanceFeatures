package Exercitiul2;

public class CreditCardProcessor implements PaymentProcessor {

    private static final double TRANSACTION_FEE_PERCENTAGE = 0.02;
    private static final double MAX_ALLOWED_AMOUNT = 5000;


    @Override
    public boolean processPayment(double amount) {

        if (amount <=0){
           logTransaction("Invalid amount " + amount);
            return false;
        }
        double fee = amount * TRANSACTION_FEE_PERCENTAGE;
        double total = amount + fee;

        if (total > MAX_ALLOWED_AMOUNT) {
            logTransaction("Failed CreditCard payment: amount $ " + amount + ", fee $ " + fee
                    + ". Exceeds limit.");
            return false;
        }

        logTransaction("Succesful creditCard payment: amount $" + amount + ", fee $" + fee +
                " total is: " + total);
        return true;
    }


}

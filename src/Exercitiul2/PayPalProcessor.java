package Exercitiul2;

public class PayPalProcessor implements PaymentProcessor {

    private String email;
    private static final double FLAT_FEE = 2.0;
    private double availibleFunds;

    public PayPalProcessor(String email) {
        if (!isValidEmail(email)){
            throw new IllegalArgumentException("Invalid paypal email adress");
        }
        this.email = email;
    }


    private boolean isValidEmail(String email) {
      return  (email != null) && (email.contains("@")) && (email.contains("."));
    }

    @Override
    public boolean processPayment(double amount) {
        if (amount <=0){
            logTransaction("Invalid Paypal amount " + amount);
            return false;
        }


        double total = amount + FLAT_FEE;
        logTransaction("Successful Paypal payment: amount $ " + amount + ", flat fee $"
                + FLAT_FEE + ", email " + email);
        return true;

    }
}
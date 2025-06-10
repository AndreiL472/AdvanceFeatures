package MultithreadingExamples.Threads.Example03;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void processTransaction(double amount, String transactionType) {
        System.out.println("Processing transaction " + transactionType);

        synchronized (this) {
            if (transactionType.equals("deposit")) {
                balance += amount;
            } else if (transactionType.equals("withdraw")) {
                balance -= amount;
            }

            System.out.println("Transaction: " + transactionType + " | Amount: " + amount + " | Balance: " + balance);
        }
    }
}

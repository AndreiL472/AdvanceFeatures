package MultithreadingExamples.Threads.Example03;

public class TransactionThread extends Thread {
    private BankAccount account;
    private double amount;
    private String transactionType;

    public TransactionThread(BankAccount account, double amount, String transactionType) {
        this.account = account;
        this.amount = amount;
        this.transactionType = transactionType;
    }

    @Override
    public void run() {
        account.processTransaction(amount, transactionType);
    }
}


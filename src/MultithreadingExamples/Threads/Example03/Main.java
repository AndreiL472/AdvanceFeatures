package MultithreadingExamples.Threads.Example03;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        TransactionThread t1 = new TransactionThread(account, 500, "withdraw");
        TransactionThread t2 = new TransactionThread(account, 200, "deposit");

        t1.start();
        t2.start();
    }
}

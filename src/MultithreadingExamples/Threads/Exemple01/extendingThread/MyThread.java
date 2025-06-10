package MultithreadingExamples.Threads.Exemple01.extendingThread;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("The thread is executing");
    }
}

package MultithreadingExamples.Threads.Exemple01.implementingRunnable;

public class Main {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start(); // start() triggers the run() method
    }
}

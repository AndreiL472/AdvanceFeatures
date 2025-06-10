package MultithreadingExamples.Deadlock.Prevention;

public class DeadlockPreventionExample {
    public static void main(String[] args) {
        final String resource1 = "Resource 1";
        final String resource2 = "Resource 2";

        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: locked " + resource1);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ignored) {}

                synchronized (resource2) {
                    System.out.println("Thread 1: locked " + resource2);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 2: locked " + resource1);

                try {
                    Thread.sleep(10000);
                } catch (InterruptedException ignored) {}

                synchronized (resource2) {
                    System.out.println("Thread 2: locked " + resource2);
                }
            }
        });

        t1.start();
        t2.start();
    }
}
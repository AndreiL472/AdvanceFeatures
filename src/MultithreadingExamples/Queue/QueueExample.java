package MultithreadingExamples.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Ion");
        queue.offer("Ana");
        queue.add("Maria");
        queue.add("Vasile");

        System.out.println("Coada: " + queue);

        String removed = queue.poll();
        System.out.println("L-am scos din coada pe " + removed);
        System.out.println(queue);

        System.out.println("Contine Maria? : " + queue.contains("abc"));
        System.out.println("Numarul de persoane in coada : " + queue.size());

        while (queue.size() > 1) {
            System.out.println("Am scos: " + queue.poll());
        }

        System.out.println("Coada finala: " + queue);
    }
}

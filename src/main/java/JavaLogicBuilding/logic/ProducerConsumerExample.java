package JavaLogicBuilding.logic;

import java.util.LinkedList;
import java.util.Queue;

class SharedResource {
    private Queue<Integer> queue = new LinkedList<>();
    private final int CAPACITY = 5; // max size of queue

    // Producer method
    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == CAPACITY) {
            System.out.println("Queue full. Producer waiting...");
            wait(); // wait until consumer consumes
        }

        queue.add(value);
        System.out.println("Produced: " + value);
        notify(); // notify consumer
    }

    // Consumer method
    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            System.out.println("Queue empty. Consumer waiting...");
            wait(); // wait until producer produces
        }

        int value = queue.poll();
        System.out.println("Consumed: " + value);
        notify(); // notify producer
        return value;
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // Producer thread
        Thread producer = new Thread(() -> {
            int value = 1;
            try {
                while (true) {
                    resource.produce(value++);
                    Thread.sleep(500); // slow down production
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    resource.consume();
                    Thread.sleep(1000); // slow down consumption
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}


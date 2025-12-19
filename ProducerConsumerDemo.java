// A Java program demonstrating inter-thread communication for the Producer–Consumer problem.
// Producer-Consumer problem using wait() and notify()

class SharedBuffer {
    private int data;
    private boolean available = false;

    // Consumer calls this
    public synchronized int consume() {
        while (!available) {
            try {
                wait(); // Wait until producer produces data
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        available = false;
        notify(); // Notify producer that buffer is empty now
        return data;
    }

    // Producer calls this
    public synchronized void produce(int value) {
        while (available) {
            try {
                wait(); // Wait until consumer consumes data
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        available = true;
        System.out.println("Produced: " + value);
        notify(); // Notify consumer that new data is available
    }
}

class Producer extends Thread {
    private SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
            try {
                Thread.sleep(500); // Simulate production delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer extends Thread {
    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            int value = buffer.consume();
            System.out.println("Consumed: " + value);
            try {
                Thread.sleep(800); // Simulate consumption delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}

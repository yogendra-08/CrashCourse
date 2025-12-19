class NumbersThread extends Thread {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("Numbers Thread: " + i);
            try {
                Thread.sleep(1000); // 1 second delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 50; i += 2) {
            System.out.println("Even Thread: " + i);
            try {
                Thread.sleep(1000); // 1 second delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 50; i += 2) {
            System.out.println("Odd Thread: " + i);
            try {
                Thread.sleep(1000); // 1 second delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Pr9Q2 {
    public static void main(String[] args) {
        NumbersThread t1 = new NumbersThread();
        EvenThread t2 = new EvenThread();
        OddThread t3 = new OddThread();

        // Set priorities
        t1.setPriority(Thread.MAX_PRIORITY);   // Highest priority
        t2.setPriority(Thread.NORM_PRIORITY);  // Normal priority
        t3.setPriority(Thread.MIN_PRIORITY);   // Lowest priority

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
    }
}

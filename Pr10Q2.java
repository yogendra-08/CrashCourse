class Displaynumber implements Runnable {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.print("Number Thread: " + i + " ");
        }
        try {
            Thread.sleep(1000);
        } 
        catch (Exception e) {
           
        }
    }
}

class DisplayEven implements Runnable {
    public void run() {
        for (int i = 2; i <= 50; i += 2) {
            System.out.print("Even number Thread: " + i + " ");
        }
        try {
            Thread.sleep(1000);
        } 
        catch (Exception e) {
           
        }
    }
}

class displayOdd implements Runnable {
    public void run() {
        for (int i = 1; i <= 50; i += 2) {
            System.out.print("Odd number Thread: " + i + " ");
        }
        try {
            Thread.sleep(1000);
        } 
        catch (Exception e) {

        }
    }
}

public class Pr10Q2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Displaynumber());
        Thread t2 = new Thread(new DisplayEven());
        Thread t3 = new Thread(new displayOdd());

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        
    }
}
class Thread1 extends Thread{

    public void run()
    {
        for(int i = 1; i<=10; i++)
        {
            System.out.println("Thread 1: " + i);
        }
    }
    try {
        Thread.sleep(100);
    } catch (Exception e) {
        
    }
}

class Thread2 extends Thread{

    public void run()
    {
        for(int i = 1; i<=10; i++)
        {
            System.out.println("Thread 2: " + i);
        }
    }
    try {
        Thread.sleep(200);
    } catch (Exception e) {
        
    }
}

class Thread3 extends Thread{

    public void run()
    {
        for(int i = 1; i<=10; i++)
        {
            System.out.println("Thread 3: " + i);
        }
    }
    try {
        Thread.sleep(300);
    } catch (Exception e) {
        
    }
}

class Thread4 extends Thread{

    public void run()
    {
        for(int i = 1; i<=10; i++)
        {
            System.out.println("Thread 4: " + i);
        }
    }
    try {
        Thread.sleep(400);
    } catch (Exception e) {
        
    }
}

class Thread5 extends Thread{

    public void run()
    {
        for(int i = 1; i<=10; i++)
        {
            System.out.println("Thread 5: " + i);
        }
    }
    try {
        Thread.sleep(500);
    } catch (Exception e) {
        
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        Thread4 t4 = new Thread4();
        Thread5 t5 = new Thread5();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

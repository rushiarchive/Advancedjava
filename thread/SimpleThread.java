package thread;

class MyThread extends Thread {
    public void run() {
        synchronized (this) {  
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread running " + i);

                if (i == 5) {
                    try {
                        System.out.println("Thread is waiting");
                        this.wait();   // wait on current object
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
public class SimpleThread {
    public static void main(String[] args) {

        MyThread t = new MyThread();
        t.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (t) {   
            System.out.println(t.getName());
            System.out.println("Main thread notifying...");
            t.notify();     // notify SAME object
        }
    }
}

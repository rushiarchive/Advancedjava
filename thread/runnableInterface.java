package thread;

class MyThread implements Runnable {

    public void run() {
        
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread running " + i);

                if (i == 5) {
                    try {
                        System.out.println("Thread is waiting");
                        this.wait();   // waiting on runnable object
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

public class runnableInterface {
    public static void main(String[] args) {

        MyThread task = new MyThread();
        Thread t = new Thread(task); 

        t.start();  // start thread

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (task) {   // SAME object
            System.out.println(t.getName());
            System.out.println("Main thread notifying...");
            task.notify();     // notify waiting thread
        }
    }
}

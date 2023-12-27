public class ThreadDemo {
    public static void main(String[] args) {
        // Create a new thread by extending the Thread class
        Thread thread1 = new MyThread();
        thread1.start();

        // Create a new thread by implementing the Runnable interface
        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();
    }
}

// A class that extends the Thread class
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread 1 is running...");
    }
}

// A class that implements the Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread 2 is running...");
    }
}
class Multithreading_Demo1 implements Runnable {
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

public class Runnable_Interface {
    public static void main(String[] args) {
        int t = 8;
        for(int i = 0; i < t; i++) {
            Thread obj = new Thread(new Multithreading_Demo1());
            obj.start();
        }
    }
}
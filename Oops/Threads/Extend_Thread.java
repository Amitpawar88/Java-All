class Multithreading_Demo extends Thread {
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}


public class Extend_Thread {
    public static void main(String[] args) {
        int t = 8;
        for(int i = 0; i < t; i++) {
            Multithreading_Demo obj = new Multithreading_Demo();
            obj.start();
        }
    }
}

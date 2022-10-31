package Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        // CustomQueue queue = new CustomQueue(5);
        CircularQueue queue = new CircularQueue(5);
        queue.insert(34);
        queue.insert(54);
        queue.insert(11);
        queue.insert(85);
        queue.insert(69);
        queue.display();

        System.out.println(queue.remove()); // removing single item takes O(n) time
        queue.insert(3489);

        queue.display();
    }
}

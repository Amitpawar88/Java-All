import java.util.Comparator;
import java.util.PriorityQueue;

public class InBuildPQ {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(); // // 12 23 34 78 
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // 78 34 23 12

        pq.add(34);
        pq.add(78);
        pq.add(23);
        pq.add(12);

        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " "); 
            pq.remove();
        }
    }
}
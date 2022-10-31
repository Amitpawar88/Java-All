package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class InBuilt {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(21);
        queue.add(276); 
        queue.add(265);
        queue.add(32);
        queue.add(44);

        System.out.println(queue.remove());
        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        
        deque.add(69);
        deque.addLast(37);
        System.out.println(deque.removeFirst());
    }
}

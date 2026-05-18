import java.util.ArrayDeque;

public class ArrayDequeRawTypePracticeDemo {

    public static void main(String[] args) {

        // Raw ArrayDeque (can store different data types)
        ArrayDeque ad = new ArrayDeque();

        ad.add(10);
        ad.add("soni");
        ad.add("neha");
        ad.add(true);

        System.out.println("Initial Deque: " + ad);

        // Add element at first position
        ad.addFirst("first");
        System.out.println("After addFirst(): " + ad);

        // Add element at last position
        ad.addLast("last");
        System.out.println("After addLast(): " + ad);

        // Queue-style insertion
        ad.offer("offerElement");
        System.out.println("After offer(): " + ad);

        // View first element
        System.out.println("peek(): " + ad.peek());

        // View first element
        System.out.println("peekFirst(): " + ad.peekFirst());

        // View last element
        System.out.println("peekLast(): " + ad.peekLast());

        // Remove first element
        System.out.println("poll(): " + ad.poll());
        System.out.println("After poll(): " + ad);

        // Remove first element
        System.out.println("pollFirst(): " + ad.pollFirst());
        System.out.println("After pollFirst(): " + ad);

        // Remove last element
        System.out.println("pollLast(): " + ad.pollLast());
        System.out.println("After pollLast(): " + ad);
    }
}
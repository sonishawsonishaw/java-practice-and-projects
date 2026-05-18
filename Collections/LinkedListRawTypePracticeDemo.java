import java.util.LinkedList;

public class LinkedListRawTypePracticeDemo {

    public static void main(String[] args) {

        // Raw LinkedList (can store different data types - NOT type safe)
        LinkedList ll = new LinkedList();

        ll.add(10);
        ll.add("Soni");
        ll.add(true);

        System.out.println("Initial List: " + ll);

        // Add at first position
        ll.addFirst(40);
        System.out.println("After addFirst(): " + ll);

        // Add at last position
        ll.addLast("soniya");
        System.out.println("After addLast(): " + ll);

        // Add at specific index
        ll.add(2, "Ajit");
        System.out.println("After add(index, value): " + ll);

        // Queue operations (insertion)
        ll.offer("panipuri");
        System.out.println("After offer(): " + ll);

        ll.offer("icecream");
        System.out.println("After offer(): " + ll);

        ll.offerFirst("first");
        System.out.println("After offerFirst(): " + ll);

        ll.offerLast("last");
        System.out.println("After offerLast(): " + ll);

        // Peek (view head element without removing)
        ll.peek();
        System.out.println("Peek value: " + ll.peek());
        System.out.println("After peek(): " + ll);

        // Poll (remove and return head element)
        System.out.println("Polled value: " + ll.poll());
        System.out.println("After poll(): " + ll);
    }
}




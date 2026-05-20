import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;

public class FailSafeIteratorDemo {

    public static void main(String[] args) {

        // Fail-Safe Collection
        CopyOnWriteArrayList<Integer> list =
                new CopyOnWriteArrayList<>();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original List: " + list);

        // Iterator
        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {

            Integer data = itr.next();

            System.out.println(data);

            // Safe modification during iteration
            list.add(100);
        }

        System.out.println("Updated List: " + list);
    }
}
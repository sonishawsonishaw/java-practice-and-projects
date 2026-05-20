import java.util.*;

public class FailFastIteratorDemo {

    public static void main(String[] args) {

        // Fail-Fast Collection
        ArrayList<Integer> list = new ArrayList<>();
      
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
            // Modifying collection during iteration
            // This will throw ConcurrentModificationException
            list.add(100);
        }
    }
} 
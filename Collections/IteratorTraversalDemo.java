import java.util.*;

public class IteratorTraversalDemo {

    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Display original list
        System.out.println("Original List: " + list);

        // Using normal for loop
        System.out.println("Using Normal For Loop");

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }

        // Using enhanced for loop
        System.out.println("Using Enhanced For Loop");

        for (Integer data : list) {

            System.out.println(data);
        }

        // Using Iterator
        System.out.println("Using Iterator");

        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {

            Integer data = itr.next();

            System.out.println(data);
        }

        // Modifying list inside normal for loop
        System.out.println("Modifying List Inside For Loop");

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));

            list.add(50);
        }
    }
}

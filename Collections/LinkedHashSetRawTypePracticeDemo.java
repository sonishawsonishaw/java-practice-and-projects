import java.util.LinkedHashSet;

public class LinkedHashSetRawTypePracticeDemo {

    public static void main(String[] args) {

        // Raw LinkedHashSet (maintains insertion order)
        LinkedHashSet lhs = new LinkedHashSet();

        // Adding elements
        lhs.add(10);
        lhs.add("soni");
        lhs.add(true);
        lhs.add('A');
        lhs.add(10); // Duplicate element

        // LinkedHashSet maintains insertion order
        System.out.println("Initial LinkedHashSet: " + lhs);

        // Checking element
        System.out.println("Contains 'soni': " + lhs.contains("soni"));

        // Removing element
        lhs.remove(true);
        System.out.println("After remove(): " + lhs);

        // Size of LinkedHashSet
        System.out.println("Size: " + lhs.size());

        // Check if empty
        System.out.println("Is Empty: " + lhs.isEmpty());

        // Clear all elements
        lhs.clear();
        System.out.println("After clear(): " + lhs);
    }
}
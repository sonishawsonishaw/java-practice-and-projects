import java.util.HashSet;

public class HashSetRawTypePracticeDemo {

    public static void main(String[] args) {

        // Raw HashSet (can store different data types)
        HashSet hs = new HashSet();

        // Adding elements
        hs.add(10);
        hs.add("soni");
        hs.add(true);
        hs.add('A');
        hs.add(10); // Duplicate element

        // HashSet does not allow duplicates
        System.out.println("Initial HashSet: " + hs);

        // Checking element
        System.out.println("Contains 10: " + hs.contains(10));

        // Removing element
        hs.remove("soni");
        System.out.println("After remove(): " + hs);

        // Size of HashSet
        System.out.println("Size: " + hs.size());

        // Check if empty
        System.out.println("Is Empty: " + hs.isEmpty());

        // Clear all elements
        hs.clear();
        System.out.println("After clear(): " + hs);
    }
}
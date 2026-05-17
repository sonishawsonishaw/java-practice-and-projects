import java.util.ArrayList;

public class ArrayListRawTypePracticeDemo {

    public static void main(String[] args) {

        // Raw ArrayList (can store different data types - NOT type safe)
        ArrayList al = new ArrayList();

        al.add("soni");
        al.add(10);
        al.add("true");
        al.add('t');

        System.out.println("Initial List: " + al);

        // Inserting element at index 0 (shifts elements to the right)
        al.add(0, true);
        System.out.println("After inserting at index 0: " + al);

        // Second ArrayList
        ArrayList al2 = new ArrayList();

        al2.add(92);
        al2.add("soni");
        al2.add(20);

        System.out.println("Second List: " + al2);

        // Merging two collections
        al2.addAll(al);

        System.out.println("After addAll(): " + al2);

        // Searching single element in collection
        System.out.println(al2.contains(20));

        // Checking if ALL elements of al are present in al2
        System.out.println(al2.containsAll(al));
    }
}
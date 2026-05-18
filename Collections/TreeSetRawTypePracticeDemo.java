import java.util.TreeSet;

public class TreeSetRawTypePracticeDemo {

    public static void main(String[] args) {

        // Raw TreeSet (stores sorted unique elements)
        TreeSet ts = new TreeSet();

        ts.add(100);
        ts.add(30);
        ts.add(50);
        ts.add(70);
        ts.add(20);

        // Elements are automatically sorted
        System.out.println("TreeSet: " + ts);

        // Smallest element >= 30
        System.out.println("ceiling(30): " + ts.ceiling(30));

        // Element strictly greater than 30
        System.out.println("higher(30): " + ts.higher(30));

        // Largest element <= 30
        System.out.println("floor(30): " + ts.floor(30));

        // Element strictly smaller than 30
        System.out.println("lower(30): " + ts.lower(30));

        // Elements from 50 onwards
        System.out.println("tailSet(50): " + ts.tailSet(50));

        // Elements before 50
        System.out.println("headSet(50): " + ts.headSet(50));
    }
}
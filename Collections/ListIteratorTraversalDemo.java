import java.util.*;

public class ListIteratorTraversalDemo {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));

        ListIterator<String> listIt = colors.listIterator();

        // Forward traversal
        System.out.print("Forward: ");
        while (listIt.hasNext()) {
            System.out.print(listIt.next() + " ");
        }

        System.out.print("\nBackward: ");
        while (listIt.hasPrevious()) {
            System.out.print(listIt.previous() + " ");
        }
    }
}
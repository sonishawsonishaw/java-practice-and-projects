import java.util.*;

public class IteratorRemoveDemo {
    public static void main(String[] args) {
        Collection<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Mango"));
        
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            String fruit = it.next();
            if (fruit.equals("Banana")) {
                it.remove(); // safely removes "Banana" from collection
            }
        }
        
        // Output: [Apple, Mango]
        System.out.println(fruits); 
    }
}
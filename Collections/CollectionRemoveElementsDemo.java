import java.util.*;
public class CollectionRemoveElementsDemo
{
    public static void main(String[] args)
    {
             Collection<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Initial Collection: " + fruits);

        // Remove a specific element
        fruits.remove("Mango");
        System.out.println("After removing Mango: " + fruits);

        // Remove all elements present in another collection
        Collection<String> toRemove = new ArrayList<>();
        toRemove.add("Apple");
        toRemove.add("Banana");

        fruits.removeAll(toRemove);
        System.out.println("After removeAll(): " + fruits);
    }
}
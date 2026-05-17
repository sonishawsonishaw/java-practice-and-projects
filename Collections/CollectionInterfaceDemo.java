import java.util.*;
public class CollectionInterfaceDemo
{
    public static void main(String[] args)
    {
        // Creating a Collection of String type using ArrayList implementation
        Collection<String> fruits = new ArrayList<>();

        // Adding elements to the collection
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        
        // Displaying the collection before removal
        System.out.println("Before Removal: " + fruits);

        // Removing an element from the collection
        fruits.remove("Banana");

        // Displaying the collection after removal
        System.out.println("After Removal: " + fruits);
    }
}


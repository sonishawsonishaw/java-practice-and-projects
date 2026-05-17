import java.util.ArrayList;

public class ArrayListUpdateElementsDemo 
{
    public static void main(String[] args)
    {

        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        System.out.println();

        System.out.println("Before Updating: " + list);
        // Updating element
        list.set(0, "Orange");

        // Print result
        System.out.println("After Updating: " + list);
    }
}
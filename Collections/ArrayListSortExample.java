import java.util.ArrayList;
import java.util.Collections;
public class ArrayListSortExample
{
    public static void main(String[] args)
    {
        ArrayList<String> fruits=new ArrayList<>();

        // Adding elements
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Grapes");

        System.out.println("Before Sorting -> "+ fruits);

        // Sorting list
        Collections.sort(fruits);

        // Print result
        System.out.println("After Sorting -> " + fruits);

    }
}
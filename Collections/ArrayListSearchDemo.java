import java.util.ArrayList;

public class ArrayListSearchDemo
{
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        // Searching for an element
        if (list.contains("Mango")) {
            System.out.println("Mango is present in the list");
        }
    }
}
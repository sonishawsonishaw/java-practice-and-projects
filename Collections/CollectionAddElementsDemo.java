import java.util.*;
public class CollectionAddElementsDemo
{
    public static void main(String[] args)
    {
          
        // Creating a collection using ArrayList implementation
        Collection<Integer> numbers = new ArrayList<>();

        // Adding individual elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Adding another collection
        Collection<Integer> moreNumbers = new ArrayList<>();
        moreNumbers.add(40);
        moreNumbers.add(50);

        numbers.addAll(moreNumbers);

        System.out.println("After adding elements: " + numbers);
    }
}

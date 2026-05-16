import java.util.ArrayList;
public class ArrayListRemoveElementsDemo
{
    public static void main(String[] args)
    {
        //Create Empty ArrayList
        ArrayList<String> al=new ArrayList<>();
        // Adding elements
        al.add("Apple");
        al.add("Banana");
        al.add("Mango");
        al.add("Grapes");
        System.out.println(al);
        //Remove by value
        al.remove("Banana");
        System.out.println(al);
        //Remove by index
        al.remove(0);
        // Print final list
        System.out.println("After removing: "+al);


    }
}
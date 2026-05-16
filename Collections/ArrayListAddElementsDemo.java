import java.util.ArrayList;
import java.util.Collections;
public class ArrayListAddElementsDemo
{
    public static void main(String[] args)
    {
        //Create empty list to store strings
        ArrayList<String> al=new ArrayList<>();
        //Add single element 
        al.add("Soni");
        al.add("Neha");
        al.add("Soni");
        System.out.println(al);
        
        //Add multiple elements 
        Collections.addAll(al,"SONI","NEHA","SONI");
        System.out.println(al);
    }
}

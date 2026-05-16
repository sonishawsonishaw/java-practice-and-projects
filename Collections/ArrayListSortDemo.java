import java.util.ArrayList;
import java.util.Collections;
public class ArrayListSortDemo
{
    public static void main(String[] args)
    {
       ArrayList<String> al=new ArrayList<>();
       al.add("Banana");
       al.add("Apple");
       al.add("Apple");
       al.add("Cucumber");
       //using Collection class
       Collections.sort(al);
       System.out.println(al);

    }
}
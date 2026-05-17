import java.util.*;
public class ListAccessElementsDemo
{
    public static void main(String[] args)
    {
               // Using List reference for index-based access
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Colors List: " + colors);

        // Accessing elements by index
        String firstColor = colors.get(0);
        String lastColor = colors.get(colors.size() - 1);

        System.out.println("First Color: " + firstColor);
        System.out.println("Last Color: " + lastColor);

    }
}
import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        // Create a new list
        List<String> list = new ArrayList<>();

        // Add elements to the list
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        System.out.println("List: " + list);

        // Remove an element from the list
        list.remove("banana");
        System.out.println("List after removing banana: " + list);

        // Update an element in the list
        list.set(1, "orange");
        System.out.println("List after updating element at index 1: " + list);
    }
}


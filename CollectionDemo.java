import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        // Create a new collection
        Collection<String> collection = new ArrayList<>();

        // Add elements to the collection
        collection.add("apple");
        collection.add("banana");
        collection.add("cherry");
        System.out.println("Collection: " + collection);

        // Remove an element from the collection
        collection.remove("banana");
        System.out.println("Collection after removing banana: " + collection);

        // Check if an element is present in the collection
        boolean contains = collection.contains("cherry");
        System.out.println("Collection contains cherry: " + contains);

        // Clear the collection
        collection.clear();
        System.out.println("Collection after clearing: " + collection);
    }
}


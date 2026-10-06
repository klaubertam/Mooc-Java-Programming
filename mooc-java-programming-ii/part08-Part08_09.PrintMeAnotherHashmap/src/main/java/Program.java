
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {

        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1881, "amazing book"));
        hashmap.put("pride", new Book("Pride and Prejudice", 1813, "terrible book"));
        printValues(hashmap);
        printValueIfNameContains(hashmap, "and");

    }

    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book book : hashmap.values()) {
            System.out.println(book);
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String title) {
        for (Book book : hashmap.values()) {
            if (book.getName().contains(title)) {
                System.out.println(book);
            }
        }
    }

}

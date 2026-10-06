
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> array = new ArrayList<>();
        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String booksname = scanner.nextLine();
            if (booksname.isEmpty()) {
                break;
            }
            System.out.println("Input the age recommendation: ");
            int agerecc = Integer.valueOf(scanner.nextLine());

            Book book = new Book(booksname, agerecc);
            array.add(book);

        }
        System.out.println(array.size() + " books in total.");
        System.out.println("");
        System.out.println("Books:");
        array.stream().sorted(Comparator.comparingInt(Book::getYear).thenComparing(Book::getName)).forEach(System.out::println);
    }

}

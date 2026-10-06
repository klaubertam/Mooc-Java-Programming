
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;

public class LiteracyComparison {

    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(rows -> rows.split(","))
                    .map(parts -> new Person(parts[2].trim(), parts[3].trim(), Integer.valueOf(parts[4].trim()), Double.valueOf(parts[5].trim())))
                    .sorted(Comparator.comparingDouble(Person::getLiteracy))
                    .forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}

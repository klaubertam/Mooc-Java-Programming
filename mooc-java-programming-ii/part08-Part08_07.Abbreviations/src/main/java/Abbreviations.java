
import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> hashmap = new HashMap<>();

    public Abbreviations() {
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        hashmap.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (hashmap.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }
    public String findExplanationFor(String abbreviation) {
      return  hashmap.get(abbreviation);
        
        
    }

}

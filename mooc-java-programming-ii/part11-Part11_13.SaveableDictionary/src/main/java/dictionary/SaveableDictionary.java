package dictionary;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
public class SaveableDictionary {

    private String filename;
    private HashMap<String, List<String>> hashmap;

    public SaveableDictionary() {
        this.hashmap = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.filename = file;
    }

    // -----------------------------
    // ADD
    // -----------------------------
    public void add(String word, String translation) {
        // If word already exists, do nothing (only one translation per word)
        if (!hashmap.containsKey(word) && !hashmap.containsKey(translation)) {
            List<String> translations = new ArrayList<>();
            translations.add(translation);
            hashmap.put(word, translations);
        }
    }

    // -----------------------------
    // TRANSLATE (both ways)
    // -----------------------------
    public String translate(String word) {
        // Direct lookup
        if (hashmap.containsKey(word)) {
            return hashmap.get(word).get(0);
        }

        // Reverse lookup
        for (Map.Entry<String, List<String>> entry : hashmap.entrySet()) {

            if (entry.getValue().contains(word)) {
                return entry.getKey();
            }
        }

        return null;
    }

    // -----------------------------
    // DELETE (both ways)
    // -----------------------------
    public void delete(String word) {
        if (hashmap.containsKey(word)) {
            hashmap.remove(word);
            return;
        }

        // Remove by translation value
        String keyToRemove = null;
       for (Map.Entry<String, List<String>> entry : hashmap.entrySet()) {

            if (entry.getValue().contains(word)) {
                keyToRemove = entry.getKey();
                break;
            }
        }

        if (keyToRemove != null) {
            hashmap.remove(keyToRemove);
        }
    }

    // -----------------------------
    // LOAD FROM FILE
    // -----------------------------
    public boolean load() {
        if (this.filename == null) return false;

        try {
            Files.lines(Paths.get(this.filename))
                    .map(line -> line.split(":"))
                    .filter(parts -> parts.length == 2)
                    .forEach(parts -> this.add(parts[0], parts[1]));
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    // -----------------------------
    // SAVE TO FILE
    // -----------------------------
    public boolean save() {
        if (this.filename == null) return false;

        try (FileWriter writer = new FileWriter(this.filename)) {
         for (Map.Entry<String, List<String>> entry : hashmap.entrySet()) {

                writer.write(entry.getKey() + ":" + entry.getValue().get(0) + "\n");
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}

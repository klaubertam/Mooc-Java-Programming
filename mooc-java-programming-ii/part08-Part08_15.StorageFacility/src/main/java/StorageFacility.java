
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> hashmap = new HashMap<>();

    public StorageFacility() {
    }

    public void add(String unit, String item) {
        hashmap.putIfAbsent(unit, new ArrayList<String>());

        ArrayList<String> units = hashmap.get(unit);
        units.add(item);

    }

    public ArrayList<String> contents(String storageUnit) {

        if (!hashmap.containsKey(storageUnit)) {
            return new ArrayList<String>();
        }

        return hashmap.get(storageUnit);
    }

    public void remove(String storageUnit, String item) {

        ArrayList<String> items = hashmap.get(storageUnit);

        items.remove(item);
        hashmap.replace(storageUnit, hashmap.get(storageUnit), items);
        if (items.isEmpty()) {
            hashmap.remove(storageUnit);
        }

    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> allmyunits = new ArrayList<>();
        for (String units : hashmap.keySet()) {
            allmyunits.add(units);
        }

        return allmyunits;

    }

}

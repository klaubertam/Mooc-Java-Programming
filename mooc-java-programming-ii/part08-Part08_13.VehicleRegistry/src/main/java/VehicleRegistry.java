
import java.util.HashMap;

public class VehicleRegistry {
    
    
    public VehicleRegistry(){}
    
     private HashMap<LicensePlate, String> hashmap = new HashMap<>();
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (hashmap.containsKey(licensePlate)) {
            return false;
        }

        hashmap.put(licensePlate, owner);

        return true;

    }

    public String get(LicensePlate licensePlate) {

        return hashmap.get(licensePlate);

    }

    public boolean remove(LicensePlate licensePlate) {
        if (hashmap.containsKey(licensePlate)) {
            hashmap.remove(licensePlate);
            return true;
        }

        return false;

    }

    public void printLicensePlates() {
        for (LicensePlate licenses : hashmap.keySet()) {

            System.out.println(licenses);
        }

    }

    public void printOwners() {
             String text="";
        for (String owners : hashmap.values()) {
            
            if(!text.contains(owners)){
            text=text+owners+"\n";
        }}
        System.out.println(text);

    }

}



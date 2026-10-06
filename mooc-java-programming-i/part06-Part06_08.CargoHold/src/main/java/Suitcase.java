import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> itemsList = new ArrayList<>();

    public Suitcase (int max) {
        this.maxWeight = max;
    }

    public void addItem(Item item) {
        if(item.getWeight() + this.totalWeight() <= this.maxWeight){
            itemsList.add(item);
        }
    }

    public void printItems() {
        for(Item items : itemsList) {
            
       System.out.println(items.toString()); }
    
}

    public int totalWeight() {
        int sum = 0;
        for(Item items : itemsList) {
            sum += items.getWeight();
        }
        return sum;
    }

    public Item heaviestItem() {
        if(itemsList.isEmpty()) { return null; }
        Item heaviest = itemsList.get(0);
        for(Item items : itemsList) {
            if(items.getWeight() > heaviest.getWeight()) {
                heaviest = items;
            }
        }
        return heaviest;
    }

    @Override
    public String toString() {
        if(itemsList.size() == 0) { 
            return "no items (0 kg)"; 
        } 
        else if(itemsList.size() == 1) { 
            return itemsList.size() + " item (" + this.totalWeight() + " kg)"; 
        } 
        else { 
            return itemsList.size() + " items (" + this.totalWeight() + " kg)"; 
        }
    }
}

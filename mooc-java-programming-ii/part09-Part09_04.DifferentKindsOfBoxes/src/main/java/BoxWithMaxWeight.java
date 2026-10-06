
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> items = new ArrayList<>();

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void add(Item item) {
        int sum = 0;
        for (Item newitem : items) {
            sum = sum + newitem.getWeight();

        }
        if (sum + item.getWeight() <= this.capacity) {
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }

}

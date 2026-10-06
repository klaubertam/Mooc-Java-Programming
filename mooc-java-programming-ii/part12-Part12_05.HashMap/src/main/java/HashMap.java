import java.util.ArrayList;
import java.util.List;
public class HashMap<K, V> {

    private List<Pair<K, V>>[] values;
    private int size;

    @SuppressWarnings("unchecked")
    public HashMap() {
        this.values = new List[32];
        this.size = 0;
    }

    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        List<Pair<K, V>> valuesAtIndex = this.values[hashValue];
        if (valuesAtIndex == null) return null;

        for (Pair<K, V> pair : valuesAtIndex) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
        return null;
    }

    public void add(K key, V value) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);

        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.size++;
        } else {
            valuesAtIndex.get(index).setValue(value);
        }

        if (1.0 * this.size / this.values.length > 0.75) {
            grow();
        }
    }

    private List<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % values.length);
        if (values[hashValue] == null) {
            values[hashValue] = new ArrayList<>();
        }
        return values[hashValue];
    }

    private int getIndexOfKey(List<Pair<K, V>> myList, K key) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getKey().equals(key)) {
                return i;
            }
        }
        return -1;
    }

    private void copy(List<Pair<K, V>>[] newArray, int fromIdx) {
        if (this.values[fromIdx] == null) return;

        for (Pair<K, V> value : this.values[fromIdx]) {
            int hashValue = Math.abs(value.getKey().hashCode() % newArray.length);
            if (newArray[hashValue] == null) {
                newArray[hashValue] = new ArrayList<>();
            }
            newArray[hashValue].add(value);
        }
    }

    @SuppressWarnings("unchecked")
    private void grow() {
        List<Pair<K, V>>[] newArray = new List[this.values.length * 2];
        for (int i = 0; i < this.values.length; i++) {
            copy(newArray, i);
        }
        this.values = newArray;
    }

    public V remove(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        List<Pair<K, V>> valuesAtIndex = this.values[hashValue];
        if (valuesAtIndex == null) return null;

        int index = getIndexOfKey(valuesAtIndex, key);
        if (index < 0) return null;

        Pair<K, V> pair = valuesAtIndex.remove(index);
        this.size--;
        return pair.getValue();
    }

    public int size() {
        return this.size;
    }
}
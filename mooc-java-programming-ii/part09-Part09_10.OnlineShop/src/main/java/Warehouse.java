
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> productPrize = new HashMap<>();
    private Map<String, Integer> productQuantity = new HashMap<>();

    public void addProduct(String product, int price, int stock) {
        productPrize.put(product, price);
        productQuantity.put(product, stock);
    }

    public int price(String product) {
        if (!productPrize.containsKey(product)) {
            return -99;
        }
        return productPrize.get(product);
    }

    public int stock(String product) {
        if (!productQuantity.containsKey(product)) {
            return 0;
        }
        return productQuantity.get(product);
    }

    public boolean take(String product) {
        if (!productPrize.containsKey(product)) {
            return false;
        }

        int howmuchthereis = productQuantity.get(product);
        if (howmuchthereis == 0) {
            return false;
        }
        productQuantity.put(product, howmuchthereis - 1);
        return true;
    }

    public Set<String> products() {
        Set<String> myproducts = productPrize.keySet();
        return myproducts;
    }
}

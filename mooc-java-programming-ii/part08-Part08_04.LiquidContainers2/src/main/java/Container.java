
public class Container {

    private int contains = 0;

    public Container() {
    }

    public void add(int amount) {
        if(amount<0){amount=0;}
        this.contains = Math.min(100, amount + this.contains);

    }

    public void remove(int amount) {
        if(amount<0){amount=0;}
        this.contains = Math.max(0, this.contains - amount);
    }

    public int contains() {
        return this.contains;
    }

    @Override
    public String toString() {
        return this.contains + "/100";
    }

}

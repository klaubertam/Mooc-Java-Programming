
import java.util.ArrayList;

public class Herd implements Movable {

    private ArrayList<Movable> myherd = new ArrayList<>();

    public void addToHerd(Movable movable) {
        myherd.add(movable);

    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movingstuf : myherd) {
            movingstuf.move(dx, dy);
        }

    }

    @Override
    public String toString() {
        String text = "";

        for (Movable movingstuf : myherd) {

            text = text+ movingstuf + "\n";
        }
        return text;
    }

}

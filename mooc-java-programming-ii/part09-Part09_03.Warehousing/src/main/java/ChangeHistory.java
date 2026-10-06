
import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history = new ArrayList<>();

    public ChangeHistory() {
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public double maxValue() {
        if (history.isEmpty()) {
            return 0;
        } else {
            double max =history.get(0);
            for (Double number : history) {
                if (max <= number) {
                    max = number;
                }

            }
            return max;
        }

    }

    public double minValue() {
        if (history.isEmpty()) {
            return 0;
        } else {
            double min = history.get(0);
            for (Double number : history) {
                if (min >= number) {
                    min = number;
                }

            }
            return min;
        }

    }

    public double average() {
        if (history.isEmpty()) {
            return 0;
        } else {
            double sum = 0;
            for (Double number : history) {
                sum = sum + number;

            }
            return sum / history.size();
        }
    }

    @Override
    public String toString() {
        if(history.isEmpty()){return "[]";}
        else if(history.size()==1){
        return "["+history.get(0)+"]";
        }
        else{
        String text = "[";
        for (int i=0;i<history.size()-1;i++) {
            text = text + history.get(i)+", ";
        }
        return text+history.get(history.size()-1)+"]";
    }}

}

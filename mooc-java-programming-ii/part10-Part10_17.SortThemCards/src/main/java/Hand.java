import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> array = new ArrayList<>();
    public void add(Card card){
    array.add(card);
    }
    public void print(){
    array.stream().forEach(values->System.out.println(values));
    }
    public void sort(){
   Collections.sort(array);
    }
    public int sum(){
    int sum1=this.array.stream().mapToInt(values->values.getValue()).sum();
    return sum1;
    }
    public int compareTo(Hand comparinghand){
     
     
if(this.sum()>comparinghand.sum()){return 1;}
else if(this.sum()<comparinghand.sum()){return -1;}
else{return 0;}


}
    
    public void sortBySuit(){
        BySuitInValueOrder sortbysuit=new BySuitInValueOrder();
    Collections.sort(array, sortbysuit);
    
    }
    
}

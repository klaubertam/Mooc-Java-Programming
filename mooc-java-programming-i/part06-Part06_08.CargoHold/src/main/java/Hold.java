import java.util.ArrayList;
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcasesList=new ArrayList<>();
    public Hold(int max){
        this.maxWeight=max;
    }
    public void addSuitcase(Suitcase suitcase){
        int sum=0;
        for(Suitcase list:suitcasesList){
        sum=sum+list.totalWeight();
        }
        if(suitcase.totalWeight()+sum<=this.maxWeight){
    suitcasesList.add(suitcase);}
    }
    
    public void printItems(){
    for(Suitcase list:suitcasesList){
    list.printItems();
    }
    }
    
    public String toString(){
        int sum=0;
        for(Suitcase list:suitcasesList){
        sum=sum+list.totalWeight();
        }
    return suitcasesList.size()+" suitcases ("+sum+" kg)";
    }
}

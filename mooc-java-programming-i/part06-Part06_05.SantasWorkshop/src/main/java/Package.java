import java.util.ArrayList;
public class Package {
    private ArrayList<Gift> giftsInThePackage=new ArrayList<>();
    
    public Package(){
    }
    
    public void addGift(Gift gift){
    giftsInThePackage.add(gift);
    }
    
    public int totalWeight(){
        int sum=0;
        for(Gift gifts:giftsInThePackage){
        sum=sum+gifts.getWeight();
        }
        
    return sum;
    }
    
}

import java.util.ArrayList;
public class OneItemBox extends Box  {
    private ArrayList<Item> items=new ArrayList<>();
    public OneItemBox(){
    
    }
    
    @Override
    public void add(Item item){
    if(items.size()==0){
   items.add(item);
    }
    }
    
    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
    
}

public class Container {
    
   private int sum=0;
    public Container(){
        
    }
    
    public void add(int amount){
    if(amount>=0){
    sum=Math.min(sum+amount, 100);
    }
    
    }
    
    public void remove(int amount){
    if(amount>=0){
    sum=Math.max(sum-amount, 0);
    }
    }
    
    public int contains(){
    return sum;
    }
    
   @Override
    public String toString(){
        return sum+"/100";
    }
    
}

import java.util.ArrayList;
public class Box implements Packable{
    private double maxCapacity;
   
    private ArrayList<Packable> packages=new ArrayList<>();
    public Box(double maxCapacity){
    this.maxCapacity=maxCapacity;
    }
    
     public void add(Packable packable){
    if(this.weight()+packable.weight()<=maxCapacity){
        packages.add(packable);
}
    }
     
     
    @Override
    public double weight() {
        double weights=0.0;
        for(Packable pack: packages){
        weights=weights+pack.weight();
        }
        return weights;
    }
    
    
   

    @Override
    public String toString() {
        return "Box: " + packages.size()+" items, total weight " + this.weight() + " kg";
    }
    
    
    
    
}

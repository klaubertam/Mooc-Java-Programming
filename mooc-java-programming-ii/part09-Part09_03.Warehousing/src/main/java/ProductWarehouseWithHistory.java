
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history=new ChangeHistory();
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
    super(productName,capacity);
            super.addToWarehouse(initialBalance);

            history.add(initialBalance);
    }
    
    public String history(){
    return history.toString();
    }
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
    history.add(this.getBalance());
    }
    public double takeFromWarehouse(double amount){
        double what=0;
       what= super.takeFromWarehouse(amount);
        history.add(this.getBalance());
        return what;
    
    }
    public void printAnalysis(){
        System.out.println("Product: "+this.getName());
        System.out.println("History: "+this.history());
        System.out.println("Largest amount of product: "+history.maxValue());
        System.out.println("Smallest amount of product: "+history.minValue());
        System.out.println("Average: "+history.average());
    }
    
    
}

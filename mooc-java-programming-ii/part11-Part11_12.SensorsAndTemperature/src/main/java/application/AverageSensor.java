
package application;
import java.util.ArrayList;
import java.util.List;

  public class AverageSensor implements Sensor{
    private ArrayList<Sensor> array ;
    private List<Integer> numbers=new ArrayList<>();
    public AverageSensor(){
    array= new ArrayList<>();
    }
public void addSensor(Sensor toAdd){
    
    array.add(toAdd);
    
}
    @Override
    public boolean isOn() {
       
        for(Sensor sensor:array){
            if(sensor.isOn()==false){
            return false;
            }
        
        }return true;
    }

    @Override
    public void setOn() {
        
       for(Sensor sensor:array){
       sensor.setOn();
       }
        
    }

    @Override
    public void setOff() {
     for(Sensor sensor:array){
     sensor.setOff();
     }
    }

    @Override
    public int read() throws IllegalStateException {
        
        
        int value=(int) Math.round(array.stream().mapToInt(values->values.read()).average().orElse(0));
        numbers.add(value);
        return value;
        
        
    }
    
    public List<Integer> readings(){
    
     if (numbers == null) {
        return new ArrayList<>();
    }
   return numbers;
    }
    
    
    
}

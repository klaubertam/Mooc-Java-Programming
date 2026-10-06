
package application;
import java.util.Random;
public class TemperatureSensor implements Sensor{
private String sensor;
public TemperatureSensor(){
sensor="off";
}

    @Override
    public boolean isOn() {
      if(sensor.equals("on")){return true;}
      return false;
    }

    @Override
    public void setOn() {
        if(sensor.equals("off")){sensor="on";}
       
    }

    @Override
    public void setOff() {
      if(sensor.equals("on")){sensor="off";}
    }

    @Override
    public int read() {
        
        return  new Random().nextInt(61)-30;
        
        
    }
    
}

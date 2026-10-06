import java.util.List;
import java.util.ArrayList;
public class Pipe <T> {
    private T myvalue;
    private List<T> values=new ArrayList<>();
    public void putIntoPipe(T value){
        values.add(value);
    }
    public T takeFromPipe(){
        if(values.isEmpty()){return null;}
        else{
    myvalue=values.get(0);
    values.remove(0);
    return myvalue;
    }}
    
    
    public boolean isInPipe(){
    if(values.isEmpty()){return false;}
    return true;
    }
    
    
    
    
}

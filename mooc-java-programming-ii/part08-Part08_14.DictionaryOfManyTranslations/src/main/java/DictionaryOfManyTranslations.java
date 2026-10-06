import java.util.ArrayList;
import java.util.HashMap;
public class DictionaryOfManyTranslations {
    private HashMap<String,ArrayList<String>> hashmap=new HashMap<>();
    
    public DictionaryOfManyTranslations(){}
    public void add(String word,String translation){
        this.hashmap.putIfAbsent(word, new ArrayList<>());
        
        
        ArrayList<String> translations=this.hashmap.get(word);
        translations.add(translation);
        
    
    
    }
    public ArrayList<String> translate(String word){
    if(!hashmap.containsKey(word)){
    return new ArrayList<>();
    }   
    return hashmap.get(word);
    
    
    }
    public void remove(String word){
    
    hashmap.remove(word);
    
    
    }
}

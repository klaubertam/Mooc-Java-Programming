
public class Hideout<T> {
    private boolean ishidden=false;
    private T toHide;
    public void putIntoHideout(T toHide){
    this.toHide=toHide;
    ishidden=true;
    }
    public T takeFromHideout(){
    ishidden=false;
    return toHide;

    }
    public boolean isInHideout(){
    return ishidden;
    }
}

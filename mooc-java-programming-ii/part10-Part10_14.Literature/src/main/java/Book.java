
public class Book {
    private String name;
    private int year;
    public Book(String name,int year){
    this.name=name;
    this.year=year;
    }
    
    public String getName(){
    return this.name;
    }
    public int getYear(){
    return this.year;
    }
    
    @Override
    public String toString(){
    return this.name+" (recommended for "+this.year+" year-olds or older)";
    
    }
}

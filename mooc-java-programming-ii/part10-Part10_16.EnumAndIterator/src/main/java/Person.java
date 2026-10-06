
public class Person {
    private String name;
    private Education educaion;
    
    public Person(String name,Education education){
    this.educaion=education;
    this.name=name;
    }
    
    public Education getEducation(){
    return this.educaion;
    }
    public String getName(){
    return this.name;
    }
    
    public String toString(){
    return this.name+", "+this.getEducation();
    }
    
    
}

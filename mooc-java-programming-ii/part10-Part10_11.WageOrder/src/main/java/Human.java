import java.lang.Comparable;
public class Human implements Comparable<Human>{

    private int wage;
    private String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }


    @Override
    public String toString() {
        return name + " " + wage;
    }
    
    @Override
    public int compareTo(Human member){
      return Double.compare(member.wage, this.wage);

    }
}

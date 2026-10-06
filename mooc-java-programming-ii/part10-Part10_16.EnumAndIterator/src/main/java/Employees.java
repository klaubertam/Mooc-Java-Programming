
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Employees {

    private List<Person> array;
    

    public Employees() {
        this.array = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        array.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream().forEach(values -> array.add(values));
    }

    public void print() {
        Iterator<Person> 
        iterator = array.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> 
        iterator = array.iterator();
       
        while (iterator.hasNext()) {
            Person wow = iterator.next();
            if (wow.getEducation() == education) {
                System.out.println(wow); 
            }
        }
       
    }

    public void fire(Education education) {
        Iterator<Person> 
        iterator = array.iterator();
        while (iterator.hasNext()) {

            if (iterator.next()
                    .getEducation() == education) {

                iterator.remove();
            }
        }
    }
}


import java.util.ArrayList;

public class Room {

    private ArrayList<Person> peopleInTheRoom = new ArrayList<>();
    public Room() {
    }

    public void add(Person person) {
        peopleInTheRoom.add(person);
    }

    public boolean isEmpty() {
        return this.peopleInTheRoom.isEmpty();
    }

    public ArrayList<Person> getPersons() {

        return this.peopleInTheRoom;

    }

    public Person shortest() {
        if (peopleInTheRoom.isEmpty() == true) {
            return null;
        }
        
        Person min = peopleInTheRoom.get(0);
        for (Person people : this.peopleInTheRoom) {
            if (people.getHeight() < min.getHeight()) {
                min = people;
                

            }

        }
        return min;
    }
    
    public Person take(){
    if(peopleInTheRoom.isEmpty()){
    return null;}
    Person shortest=this.shortest();
   peopleInTheRoom.remove(shortest);
   return shortest;
    }
}
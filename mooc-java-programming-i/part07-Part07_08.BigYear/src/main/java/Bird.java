
public class Bird {

    private String name;
    private String latin;
    private int observations = 0;

    public Bird(String name, String latin, int observations) {
        this.latin = latin;
        this.name = name;
        this.observations = observations;
    }

    public String getName() {
        return this.name;
    }

    public int getObservation() {
        return this.observations;
    }
    public void addObservation(){
    this.observations++;
    }

    public String toString() {

        return this.name + " (" + this.latin + "): " + this.observations + " observations";
    }

}

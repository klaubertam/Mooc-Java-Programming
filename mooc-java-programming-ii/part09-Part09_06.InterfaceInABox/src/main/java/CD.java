
public class CD implements Packable {

    private String artist;
    private String name;
    private int year;
    private double weight=0.1;

    public CD(String artist, String name, int year) {
        this.name = name;
        this.artist = artist;
        this.year = year;
        this.weight=0.1;

    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.year + ')';
    }

}

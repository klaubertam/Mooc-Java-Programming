
public class Person {

    private String gender;
    private String state;
    private int year;
    private double literacy;

    public Person(String gender, String state, int year, double literacy) {
        this.gender = gender.toLowerCase().contains("female") ? "female" : "male";
        this.literacy = literacy;
        this.state = state;
        this.year = year;

    }

    public double getLiteracy() {
        return this.literacy;
    }

    @Override
    public String toString() {
        return state + " (" + year + "), " + gender + ", " + literacy;
    }

}

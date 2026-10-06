
import java.util.Objects;


public class LicensePlate {

   
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object object) {
        if (this.getClass() != object.getClass()|| object==null) {

            return false;
        }
        if (this == object) {
            return true;
        }
        LicensePlate testinglicense = (LicensePlate) object;

        if (this.country.equals(testinglicense.country) && this.liNumber.equals(testinglicense.liNumber)) {
            return true;

        }
        return false;

    }

    @Override
    public int hashCode() {

        return this.country.hashCode() + this.liNumber.hashCode();
    }}

    
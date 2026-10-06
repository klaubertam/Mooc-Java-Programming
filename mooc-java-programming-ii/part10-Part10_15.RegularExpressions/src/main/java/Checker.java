
public class Checker {

    public Checker() {
    }

    public boolean isDayOfWeek(String string) {
        String matcher = "mon|tue|wed|thu|fri|sat|sun";
        if (string.matches(matcher)) {
            return true;
        }
        return false;

    }
    public boolean allVowels(String string){
      String matcher = "[aeiou]+";
        if (string.matches(matcher)) {
            return true;
        }
        return false;
    
    
    }
    public boolean timeOfDay(String string){
      String matcher = "([0-1][0-9]|[2][0-3]):[0-5][0-9]:[0-5][0-9]";
        if (string.matches(matcher)) {
            return true;
        }
        return false;
    
    
    }

}

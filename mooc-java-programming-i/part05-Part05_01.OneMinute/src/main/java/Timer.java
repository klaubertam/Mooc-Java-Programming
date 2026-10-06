
public class Timer {

    private ClockHand seconds;
    private ClockHand hundredthsOfaSecond;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredthsOfaSecond = new ClockHand(100);
    }

    public void advance() {
        this.hundredthsOfaSecond.advance();
        if (this.hundredthsOfaSecond.value()==0) {
            this.seconds.advance();
        }
    }

    @Override
    public String toString() {
        
            return seconds+":"+hundredthsOfaSecond;
        

       
    }

}


public class Whistle {
    private String sound;
        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");
    public Whistle(String whistleSound){
         duckWhistle.sound();
         roosterWhistle.sound();

        
    }
    public void sound(){
       System.out.println(duckWhistle.sound );
       System.out.println(roosterWhistle.sound );
        
    }
}

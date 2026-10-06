public class Student {

    private int ID;
    private String emer;
    private String mbiemer;
    private int nota;

    public Student() {
    }

    public Student(int ID, String emer, String mbiemer, int nota) {
        this.ID = ID;
        this.emer = emer;
        this.mbiemer = mbiemer;
        this.nota = nota;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmer() {
        return emer;
    }

    public void setEmer(String emer) {
        this.emer = emer;
    }

    public String getMbiemer() {
        return mbiemer;
    }

    public void setMbiemer(String mbiemer) {
        this.mbiemer = mbiemer;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    public boolean gjejJoKaluesit(int nota){
            return nota>5;
        }
    public void afisho(){
        System.out.print("ID: "+ID);
        System.out.print("/ Emri: "+emer);
        System.out.print("/ Mbiemer: "+mbiemer);
        System.out.print("/ Nota: "+nota);
      System.out.println("/ kalon ? : " + (gjejJoKaluesit(nota) ? "Po" : "Jo"));}
    
}



public class Main {

    public static void main(String[] args) {

    Gift bicycle=new Gift("bike",2);
    Package giftsForBerta=new Package();
    giftsForBerta.addGift(bicycle);
        System.out.println(bicycle+" "+giftsForBerta.totalWeight());

    }
}

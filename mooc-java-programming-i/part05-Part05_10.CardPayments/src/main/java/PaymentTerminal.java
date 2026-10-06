
public class PaymentTerminal {

    private double money;  
    private int affordableMeals; 
    private int heartyMeals;  

    public PaymentTerminal() {
        money = 1000;
    }

    public double eatAffordably(double payment) {
        if (payment >= 2.5) {
            affordableMeals++;
            money = money + 2.5;
            return payment - 2.5;

        } else {
            
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        if (payment >= 4.3) {
            heartyMeals++;
            money = money + 4.3;
            return payment - 4.3;

        } else {
            return payment;
        }

    }
        public boolean eatAffordably(PaymentCard card) {
            if(card.balance()>=2.5){
                card.takeMoney(2.5);
                affordableMeals++;
                return true;
            }
            else{return false;}
        
    }

    public boolean eatHeartily(PaymentCard card) {
            if(card.balance()>=4.3){
                card.takeMoney(4.3);
                heartyMeals++;
                return true;
            }
            else{return false;}
        
    }
    
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        if(sum>=0){
    card.addMoney(sum);
    money=money+sum;}
       
}

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}

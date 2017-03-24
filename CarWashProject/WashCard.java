public class WashCard{
    private String washcardNr;
    private int balanceWc;
    private int cardPrice;


    public WashCard(String washcardNr,int balanceWc, int cardPrice){
        this.washcardNr = washcardNr;
        this.balanceWc = balanceWc;
        this.cardPrice = cardPrice;

    }
    public void useWashcard(int carwashPrice){
        if(carwashPrice <= balanceWc){
            balanceWc = balanceWc - carwashPrice;
        }
        else{
            System.out.println("insufficient");
        }
    }
        

    public void setprice( int newCardPrice){
        if(newCardPrice < 1000 && newCardPrice > 200){
            cardPrice = newCardPrice;
            balanceWc = newCardPrice;
            
        }
        else{
            System.out.println("You failed!");
        }
 
    }

    public int getCardPrice(){
        return cardPrice;
    }

    public int getBalanceWc(){
        return balanceWc;
    }
    public String printReciept(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Washcard reciept");
        System.out.println("Your balance on your washcard is now: " + balanceWc + " kr");
        return "" ;
    }
    
}
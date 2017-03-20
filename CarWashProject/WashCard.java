public class WashCard{
    private String washcardNr;
    private double balanceWc;
    private double cardPrice;


    public WashCard(String washcardNr,double balanceWc, double cardPrice){
        this.washcardNr = washcardNr;
        this.balanceWc = balanceWc;
        this.cardPrice = cardPrice;

    }


    public void setprice( double newCardPrice){
        cardPrice = newCardPrice;

    }
}
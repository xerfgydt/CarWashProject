public class CreditCard{
    private String creditcardNr;
    private double balanceCc;

    public CreditCard(String creditcardNr,double balanceCc){
        this.creditcardNr = creditcardNr;
        this.balanceCc = balanceCc;
    }


    public void setBalance(double newBalanceCc){
        balanceCc = newBalanceCc;

    }
    public double getBalanceCc(){
        return balanceCc;
    }
       
       
       
       
    // public void buyWashCard(double price){

    //     if(balanceCc - price >= 0){
    //         balanceCc = balanceCc - price;
    //         balanceWc = balanceWc + price;
    //         System.out.print("Here is your WashCard");
    //         System.out.print("The amount of money on this card is: " + balanceWc + "Kr");
    //     }
    //     else{
    //         System.out.println("Insufficient gold");
    //     } 
    // }

    // public void refillWashcard(double input){
    //         if(balanceCc - input >= 0){
    //         balanceWc = balanceWc + input;
    //         System.out.print("The amount of money on this card has been changed to: " + balanceWc + "Kr");
    //     }
    //     else{
    //         System.out.println("Insufficient gold");
    // }
    // }


}
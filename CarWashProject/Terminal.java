import java.util.Date;
public class Terminal{
    public static void main(String[]args){
        
        Date date = new Date();
        Customer customer1 = new Customer("Rasmus","Pallesen",12345678,true);
        CreditCard creditcard1 = new CreditCard("abc123", 5000);
        WashCard washcard1 = new WashCard("123abc", 0, 0);
        Carwash carwash1 = new Carwash("", 0);

       System.out.println("hello choose Options");
       System.out.println("");
       System.out.println("Buy a wash card (1)");
       System.out.println("");
       System.out.println("Buy Car Wash (2)");
       System.out.println("");
       System.out.println("Refill Wash Card (3)");
       System.out.println("");
       System.out.println("Check Wash Card Balance (4)");
       System.out.println("");
       System.out.println("Owner Options (5)");
       
       String optionChoice = System.console().readLine();

       if(optionChoice.equals("1")){
        System.out.println("You chose Buy washcard");
        System.out.println("");
        System.out.println("choose a price for your washcard between (200-1000)");
        int washcardprice = Integer.parseInt(System.console().readLine());
        washcard1.setprice(washcardprice);
        System.out.println("You are about to buy a " + washcardprice + "kr washcard" );
        System.out.println("Do you want to confirm this (y/n)");
        String confirmPurchase = System.console().readLine();
        if(confirmPurchase.equals("y")){
            creditcard1.buyWashCard(washcard1.getCardPrice());
            System.out.println(" Do you want a Reciept? (y/n)");
            String printReciept = System.console().readLine();
            if(printReciept.equals("y")){
            System.out.print(washcard1.printReciept());
            System.out.println(date.toString());
            System.out.println("Have a Nice Day");
            }
            else if(printReciept.equals("n")){
                System.out.println("Have a Nice Day");
            }
            else{
                System.out.println("YOU FAIL");
            }

        }
        else if(confirmPurchase.equals("n")){
            System.out.println("canceling purchase");
        }
        else{
            System.out.println("YOU KEEP FAILING!!! YOU FAILURE!!!!");
        }

       }
       else if(optionChoice.equals("2")){
            System.out.println("Buy Car Wash Stuff");
       }
       else if(optionChoice.equals("3")){
            System.out.println("Refill wash card stuff");
       }
       else if(optionChoice.equals("4")){
            System.out.println("Check card balance stuff");
       }
       else if(optionChoice.equals("5")){
            System.out.println("owner optuion stuff");
       }
       else{
           System.out.println("You need to choose between option 1-5 ");
       }








        // carwash1.setwashType("1");
        // carwash1.setprice(carwash1.getwashtype());






    }
}
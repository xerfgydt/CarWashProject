public class Carwash{
    private String statistics;
    private String washTypes;
    private int price;
    // private String date;

    public Carwash(String washTypes,int price){
        this.washTypes = washTypes;
        this.price = price;
        // this.date = date;
    }

    public void setwashType(String input){
        if(input.equals("1")){
            washTypes = "GoldWash";
        }
        else if(input.equals("2")){
            washTypes = "SilverWash";
        }
        else if(input.equals("3")){
            washTypes = "BronzeWash";
        }
        else{
            System.out.println("Error. Does not compute");
        }
   }
   public String getwashtype(){
       return washTypes;
   }

   public void setprice(String newPrice){
       if(newPrice.equals("GoldWash")){
           price = 150;
           }
           else if(newPrice.equals("SilverWash")){
               price = 100;
           }
           else if(newPrice.equals("BronzeWash")){
               price = 50;
           }
        else{
            System.out.println("kijgh");
        }
    }

    public int getPrice(){
        return price;
    }
    public void printReciept(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(washTypes);
        System.out.println(price);
    }




}
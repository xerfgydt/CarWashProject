public class Carwash{
    private String statistics;
    private String washTypes;
    private double prices;
    private String date;

    public Carwash(String washTypes,double prices, String date){
        this.washTypes = washTypes;
        this.prices = prices;
        this.date = date;
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




}
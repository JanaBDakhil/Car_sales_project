
package carproject;

import java.util.Scanner;
public class MotorBike extends Vehicle {
   private String MotorBikeType; 
   
   public MotorBike(){}
   
    public MotorBike(String MotorBikeType, String model, String color, int releaseYear) {
        super(model, color,  releaseYear);
        this.MotorBikeType = MotorBikeType;
    }

    public String getMotorBikeType() {
        return MotorBikeType;
    }

    public void setMotorBikeType(String MotorBikeType) {
        this.MotorBikeType = MotorBikeType;
    }

    @Override
    public String toString() {
        return "MotorBike{"+super.toString() + "MotorBikeType=" + MotorBikeType + '}';
    }
   
    public static void ourMotorBikes(){
        
        System.out.println("our avabiles MotorBikes:\nZero(sport/mountain)(2021/2022)\nHonda(sport/mountain)(2021/2022) \nBMW(sport/mountain)(2021/2022))");
        System.out.println("Enter the name of the MotorBike you want then enter its type(sport or mountain) , its releaseYear and Color");
}
    
       @Override
    public int addFuel(){
        System.out.println("this MotorBikes Capicity is:"+Capacities[0]+" liters, how many liters you want to add");
        Scanner input= new Scanner(System.in);
         int liters;
        while(true){
        liters=input.nextInt();
        if(liters<0||liters>15)
            System.out.println("please enter amoutn between 0-15");
        else
         return liters;
        }
       
    }
   
}

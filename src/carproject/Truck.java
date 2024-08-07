
package carproject;
import java.util.Scanner;
public class Truck extends Vehicle {
    private int payload;
    
    public Truck(){}

    public Truck(int payload, String model, String color,  int releaseYear) {
        super(model, color, releaseYear);
        this.payload = payload;
    }

    public int getpayload() {
        return payload;
    }

    public void setpayload(int cargoCapicty) {
        this.payload = cargoCapicty;
    }

    @Override
    public String toString() {
        return "Truck{"+super.toString() + "payload=" + payload + '}';
    }
    
    public static void ourTrucks(){
        
        System.out.println("our avabiles Trucks:\nToyota(maximum payload:1100kg/1500kg)(2021/2022)\nFord((maximum payload:1400kg/1800kg) (2021/2022))");
        System.out.println("Enter the name of the truck you want then enter the payload ,its Color and  releaseYear");
}
        @Override
    public int addFuel(){
        System.out.println("this Car Capicity is:"+Capacities[2]+" liters, how many liters you want to add");
        Scanner input= new Scanner(System.in);
         int liters;
        while(true){
        liters=input.nextInt();
        if(liters<0||liters>80)
            System.out.println("please enter amoutn between 0-80");
        else
         return liters;
        }
       
    }
    
    
}

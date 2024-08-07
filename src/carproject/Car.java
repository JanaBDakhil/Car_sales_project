
package carproject;

import java.util.Scanner;
public class Car extends Vehicle {
    private String carType;
 
    public Car(){}
    public Car(String carType,  String model, String color, int releaseYear) {
        super(model, color, releaseYear);
        this.carType = carType;
       
    }

   

    
    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    

    @Override
    public String toString() {
        return "Car{"+super.toString() + "carType=" + carType +  '}';
    }
    
    
    public static void ourCars(){
        
        System.out.println("our avabiles cars:\nHyundai(normal)(2021/2022)\nBMW(Normal/Sport)(2021/2022) \nFord(Normal/Sport)(2021/2022))");
        System.out.println("Enter the name of the car you want then enter its type(normal or sport) , its releaseYear and Color");
}
 
    @Override
    public int addFuel(){
        System.out.println("this Car Capicity is:"+Capacities[1]+" liters, how many liters you want to add");
        Scanner input= new Scanner(System.in);
         int liters;
        while(true){
        liters=input.nextInt();
        if(liters<0||liters>45)
            System.out.println("please enter amoutn between 0-45");
        else
         return liters;
        }
       
    }
    
    
}

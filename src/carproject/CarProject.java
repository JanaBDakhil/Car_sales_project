
package carproject;

import java.util.Scanner;
import java.util.ArrayList;
public class CarProject {


    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        ArrayList<Vehicle> soldedVehicles=new ArrayList<>();
        ArrayList <invoice> invoices=new ArrayList<>();
        System.out.println("Welcome to our store");
        System.out.println("Please Enter Your FirstNam,Last Name, and your Phone Number");
        String FirstName=input.next();
        String LastName=input.next();
        String PhoneNumber=input.next();
        Customer customer=new Customer(FirstName,LastName,PhoneNumber);
         int c=1;
        while(c==1){
        System.out.println("enter number of option \n1-Car\n2-Truck\n3-MotorBike");
       int option;
        try{
        option=input.nextInt();
        }catch(Exception ex){
            System.out.println("you entered string value insted of number");
            return;
        }
        
         String Name;
         String Type;
         int ReleaseYear;
         String Color;
         
        if(option==1){
            
       Car.ourCars();
       Name =input.next();
       Type=input.next();
       try{
       ReleaseYear=input.nextInt();
       }catch(Exception ex){
            System.out.println("you entered string value insted of number");
            return;
        }
       Color=input.next();
       
       Car carOb=new Car(Type,Name,Color,ReleaseYear);
       
       int liters=carOb.addFuel();
       
       soldedVehicles.add(carOb);
       
       invoice in=new invoice (carOb,customer,liters);
               
        System.out.println("your invoice:");
        System.out.println(in);
        invoices.add(in);
        }
        
        
        
        else if(option==2){
        int payload;
        Truck.ourTrucks();
        Name =input.next();
       try{
       ReleaseYear=input.nextInt();
       }catch(Exception ex){
            System.out.println("you entered string value insted of number");
            return;
        }
        Color=input.next();
        payload=input.nextInt();
        Truck truckOb=new Truck(payload,Name,Color,ReleaseYear);
        
        
        int liters=truckOb.addFuel();
       
       soldedVehicles.add(truckOb);
       
       invoice in=new invoice (truckOb,customer,liters);
               
        System.out.println("your invoice:");
        System.out.println(in);
        invoices.add(in);
        }
        
        
        
        else if(option==3){
            
        MotorBike.ourMotorBikes();
        Name =input.next();
        Type=input.next();
        try{
             ReleaseYear=input.nextInt();
        }catch(Exception ex){
            System.out.println("you entered string value insted of number");
            return;
         }
        Color=input.next();
        
       MotorBike motorBikekOb=new  MotorBike(Type,Name,Color,ReleaseYear);
        
       int liters=motorBikekOb.addFuel();
       
       soldedVehicles.add(motorBikekOb);
       
       invoice in=new invoice (motorBikekOb,customer,liters);
       invoices.add(in);
               
        System.out.println("your invoice:");
        System.out.println(in);
        
        }
            System.out.println("if you want to buy another thing click 1 or if you want to exit click 0");
            c=input.nextInt();
       
        }
        
        System.out.println("if you want to show your invoices click 1 or 0 to exit");
        int choose2=input.nextInt();
        
        
        if(choose2==1){
          System.out.println("------------------------------------------------------");
            for(invoice i:invoices){
                System.out.println(i);
                System.out.println("------------------------------------------------------");
            }
        }
       
    }
    
}

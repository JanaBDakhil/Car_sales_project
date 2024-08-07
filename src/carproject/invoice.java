
package carproject;

public class invoice {
    private Vehicle vehicle;
    private Customer customer;
    private int liters;

    public invoice() {
    }
    

    public invoice(Vehicle v, Customer c,int liters) {
        this.vehicle = v;
        this.customer = c;
        this.liters=liters;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle v) {
        this.vehicle = v;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer c) {
        this.customer = c;
    }

    public int getLiters() {
        return liters;
    }

    public void setLiters(int liters) {
        this.liters = liters;
    }

    @Override
    public String toString() {
        return 
                "Vehicle Details:"+ vehicle + "\n" 
                +"Your information:"+ customer +"\n"
                +"liters=" + liters ;
    }
    

    
    
    
}

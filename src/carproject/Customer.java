
package carproject;

public class Customer {
    private String FirtsName;
    private String LastName;
    private String PhoneNumber;

    public Customer() {
    }
    

    public Customer(String FirtsName, String LastName, String PhoneNumber) {
        this.FirtsName = FirtsName;
        this.LastName = LastName;
        this.PhoneNumber = PhoneNumber;
    }

    public String getFirtsName() {
        return FirtsName;
    }

    public void setFirtsName(String FirtsName) {
        this.FirtsName = FirtsName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" + "FirtsName=" + FirtsName + ", LastName=" + LastName + ", PhoneNumber=" + PhoneNumber + '}';
    }
    
    
}

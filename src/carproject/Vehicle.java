
package carproject;


public abstract class  Vehicle implements Fuel {
    private String model;
    private String color;
    private int releaseYear;
    
    public Vehicle(){}
    public Vehicle(String model, String color,  int releaseYear) {
        this.model = model;
        this.color = color;
        this.releaseYear = releaseYear;
    }

    
    
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

 

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return  "model=" + model + ", color=" + color + ", releaseYear=" + releaseYear ;
    }
    
    
    
    
    
    
}

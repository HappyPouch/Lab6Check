
/**
 * Hildebrandt Car Class example
 * 
 */
public class Car
{
    private int year;
    private String color;
    private String make;
    private String model;
    private int currSpeed;
    
    //default constructor
    public Car()
    {
        year = 0;
        make = "Ford";
        model = "F150";
        color = "white";
        currSpeed = 0;
    }
    
    //Constructors
    public Car(int y, String mak, String mod, String col,int cs)
    {
        year = y;
        color = col;
        make = mak;
        model = mod;
        currSpeed = cs;
    }
    
    // accessor methods (functions)
    public String getColor()
    {
        return color;
    }
    
    public String getMakeAndModel()
    {  
        return make + " " + model;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public int getCurrSpeed()
    {
        return currSpeed;
    }
    
    public void accelerate(int num)
    {
        currSpeed += num;
    }
    
    public void paintJob(String newColor)
    {
        color = newColor;
    }
    
    public String toString()
    {
        return year + " " + getMakeAndModel() + "\n\tColor: " + color +
                "\n\tCurrent speed: " + currSpeed;
    }
    
    
            
}
    
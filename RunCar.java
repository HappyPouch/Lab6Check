
/**
 * This class tests the Car class
 */
public class RunCar
{
    
    public static void main()
    {
        Car c1 = new Car(2001,  "Volkswagen", "Golf","blue", 120);
        Car c2 = new Car(2017,  "Porsche", "911","red", 350);
        Car c3 = new Car(1975,  "Lincoln", "TownCar","black", 0);
        
        System.out.println("The cars are: ");
        System.out.println(c1.toString());
        System.out.println(c2);  // defaults to the toString method
        System.out.println(c3);
        
        System.out.println("These cars have been changed");
        c2.paintJob("magenta");
        System.out.println(c2);
        
        c3.accelerate(100);
        System.out.println(c3);
        
        //System.out.println(c1.color);
    }
}
    
	
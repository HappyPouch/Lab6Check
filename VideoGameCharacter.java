
/**
 * Write a description of class VideoGameCharacter here.
 *
 * Tom Paulo Sadaya
 * January 14, 2026
 */
public class VideoGameCharacter
{
    private String element;
    private String name;
    private String weapon;
    private int age;
    private int stars;
    
    // default constructor
    public VideoGameCharacter()
    {
        element = "Pyro";
        name = "Diluc";
        weapon = "Claymore";
        age = 21;
        stars = 5;
    }
    
    //Constructors
    public VideoGameCharacter(String e, String n, String w, int a, int s)
    {
        element = e;
        name = n;
        weapon = w;
        age = a;
        stars = s;
    }
    
    // accessor methods (functions)
    public String getElement()
    {
        return element;
    }
    
    public String getName()
    {  
        return name;
    }
    
    public String getWeapon()
    {
        return weapon;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public int getRarity()
    {
        return stars;
    }
    
    public void timeSkip(int yearsPassed)
    {
        age += yearsPassed;
    }
    
    public void weaponChange(String newWeapon)
    {
        weapon = newWeapon;
    }
    
    public String toString()
    {
        return getName() + " is " + getAge() + " years old. They are " + getRarity() + " stars." + 
                           "\nTheir weapon of choice is the " + getWeapon() + " and wields the element of " + getElement() + ".\n";
    }
}
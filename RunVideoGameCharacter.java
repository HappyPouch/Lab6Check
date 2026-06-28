
/**
 * This class tests the VideoGameCharacter class
 */
public class RunVideoGameCharacter
{
    
    public static void main()
    {
        VideoGameCharacter c1 = new VideoGameCharacter("Electro", "Razor", "Greatsword", 7, 4);
        VideoGameCharacter c2 = new VideoGameCharacter("Pyro", "Hu Tao", "Spear", 24, 5);
        VideoGameCharacter c3 = new VideoGameCharacter("Hydro", "Furina", "Sword", 24, 5);
        
        System.out.println("The characters are: ");
        System.out.println(c1.toString());
        System.out.println(c2);  // defaults to the toString method
        System.out.println(c3);
        
        System.out.println("Furina has been cursed with immortality" + "\n");
        c3.timeSkip(500);
        System.out.println(c3);
        
        System.out.println("Hu Tao has decided to switch her weapon" + "\n");
        c2.weaponChange("Catalyst");
        System.out.println(c2);
    }
}
    
    

/**
 * Sample Picture
 * Hildebrandt
 * Unit 6 Classes Q3 Example
 * 
 * This is just an example.
 * Create your own Picture class and include PIVs, a default constructor and a draw method.
 * 
 */
public class HildebrandtPicture
{
    private Square ground;
    
    private Square building;
    private Circle tower;
    
    private Square sky;
    
    private Square elevatorRail;
    private Square elevatorBox;
    private Square window;
    
    private Triangle star1;
    private Triangle star2;
    private Circle star3;
    private Circle star4;
    private Circle star5;
    

    public HildebrandtPicture()
    {
     ground = new Square();
     
     building = new Square();
     tower = new Circle();
     sky = new Square();
     
     elevatorRail = new Square();
     elevatorBox = new Square();
     window = new Square();

     star1 = new Triangle();
     star2 = new Triangle();
     star3 = new Circle();
     star4 = new Circle();
     star5 = new Circle();
    
    }
    
    public void draw()
    {
        sky.makeVisible();
        sky.changeColor("darkBlue");//make dark blue-check RGB
        sky.changeSize(500, 500);
        sky.moveVertical(-50);
        sky.moveHorizontal(-60);
        
        star1.makeVisible();
        star1.changeSize(5,5);
        star1.moveVertical(10);
        star1.moveHorizontal(5);
        star1.changeColor("white");
        
        star2.makeVisible();
        star2.changeSize(5,5);
        star2.moveVertical(5);
        star2.moveHorizontal(300);
        star2.changeColor("white");
        
        star3.makeVisible();
        star3.changeSize(5,5);
        star3.moveVertical(100);
        star3.moveHorizontal(380);
        star3.changeColor("white");
        
        star4.makeVisible();
        star4.changeSize(5,5);
        star4.moveVertical(90);
        star4.moveHorizontal(75);
        star4.changeColor("white");
        
        star5.makeVisible();
        star5.changeSize(5,5);
        star5.moveVertical(10);
        star5.moveHorizontal(400);
        star5.changeColor("white");
        
        ground.makeVisible();
        ground.moveVertical(350);
        ground.moveHorizontal(-60);
        ground.changeColor("darkGray");
        ground.changeSize(500,300);
         
        building.makeVisible();
        building.moveVertical(50);
        building.moveHorizontal(140);
        building.changeSize(50, 350);
        building.changeColor("lightGray");
        
        tower.makeVisible();
        tower.moveVertical(10);
        tower.moveHorizontal(112);
        tower.changeSize(190, 85);
        tower.changeColor("lightGray");
        
        
        elevatorRail.makeVisible();
        elevatorRail.changeColor("black");
        elevatorRail.changeSize(10, 300);
        elevatorRail.moveVertical(95);
        elevatorRail.moveHorizontal(160);
        
        elevatorBox.makeVisible();
        elevatorBox.changeSize(35, 40);
        elevatorBox.changeColor("black");
        elevatorBox.moveVertical(355);
        elevatorBox.moveHorizontal(148);
        
        window.makeVisible();
        window.changeColor("gold");
        window.changeSize(185, 10);
        window.moveVertical(55);
        window.moveHorizontal(75);
                
        elevatorBox.slowMoveVertical(-265);
        elevatorBox.slowMoveVertical(265);
        
    }
    
}
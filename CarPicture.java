
/**
 * Basic Car example
 */
public class CarPicture
{
    private Circle w1;
    private Circle w2;
    //private Triangle t;
    private Square s;
    private Square s1; 
    
    public CarPicture()
    {
        w1 = new Circle();
        w2 = new Circle();
        //t = new Triangle();
        s = new Square();
        s1 = new Square();
    }

    
    public void draw()
    {
        //c.makeVisible();
        
        s.makeVisible();
        s.changeColor("red");
        s.changeSize(300,100);
        s.moveHorizontal(150);
        s.moveVertical(500);
        
        w1.makeVisible();
        w1.changeColor("black");
        w1.changeSize(75,75);
        w1.moveHorizontal(220);
        w1.moveVertical(550);
        
        w2.makeVisible();
        w2.changeColor("black");
        w2.changeSize(75,75);
        w2.moveHorizontal(420);
        w2.moveVertical(550);
        
    }
}

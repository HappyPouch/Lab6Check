
/**
 * Basic example
 */
public class BasicPicture
{
    private Circle c;
    private Triangle t;
    private Square s;
    
    public BasicPicture()
    {
        c = new Circle();
        t = new Triangle();
        s = new Square();
    }

    
    public void draw()
    {
        c.makeVisible();
        t.makeVisible();
        s.makeVisible();
    }
}


/**
 * A dog in the park looking at you, while blinking.
 *
 * Tom Paulo Sadaya
 */
public class TomPauloPicture
{
    private Square sky;
    private Circle sun;
    private Circle grassHill_1;
    private Circle grassHill_2;
    
    private Circle dogHead_outline;
    private Circle dogHead_base;
    
    private Circle dogBody_outline;
    private Circle dogBody_base;
    
    private Circle leg_1;
    private Circle leg_2;
    private Circle leg_3;
    private Circle leg_4;
    
    private Circle eye_1;
    private Circle eye_2;
    
    private Triangle ear_1;
    private Triangle ear_2;
    
    private Circle dogSnout_ouline;
    private Circle dogSnout_base;
    
    private Triangle nose;
    
    private Circle mouthOutline_1;
    private Circle mouth_1;
    private Circle mouthOutline_2;
    private Circle mouth_2;
    
    private Square blink;
    
    public TomPauloPicture()
    {
        sun = new Circle();
        sky = new Square();
        grassHill_1 = new Circle();
        grassHill_2 = new Circle();
        
        dogHead_outline = new Circle();
        dogHead_base = new Circle();
        
        dogBody_outline = new Circle();
        dogBody_base = new Circle();
        
        leg_1 = new Circle();
        leg_2 = new Circle();
        leg_3 = new Circle();
        leg_4 = new Circle();
        
        eye_1 = new Circle();
        eye_2 = new Circle();
        
        blink = new Square();
        
        ear_1 = new Triangle();
        ear_2 = new Triangle();
        
        dogSnout_ouline = new Circle();
        dogSnout_base = new Circle();
        
        nose = new Triangle();
        
        mouthOutline_1 = new Circle();
        mouth_1 = new Circle();
        mouthOutline_2 = new Circle();
        mouth_2 = new Circle();
    }

    
    public void draw()
    {
        // draw background
        sky.makeVisible();
        sky.moveVertical(-200);
        sky.moveHorizontal(-300);
        sky.changeSize(1300, 1000);
        sky.changeColor("blue");
        
        sun.makeVisible();
        sun.moveVertical(0);
        sun.moveHorizontal(670);
        sun.changeSize(250, 250);
        sun.changeColor("yellow");
        
        grassHill_1.makeVisible();
        grassHill_1.moveVertical(300);
        grassHill_1.moveHorizontal(-300);
        grassHill_1.changeSize(1300, 1000);
        grassHill_1.changeColor("green");
        
        grassHill_2.makeVisible();
        grassHill_2.moveVertical(400);
        grassHill_2.moveHorizontal(300);
        grassHill_2.changeSize(1000, 1000);
        grassHill_2.changeColor("green");
        
        // draw dog
        dogBody_outline.makeVisible();
        dogBody_outline.moveVertical(215);
        dogBody_outline.moveHorizontal(299);
        dogBody_outline.changeSize(192, 250);
        dogBody_outline.changeColor("black");
        
        dogBody_base.makeVisible();
        dogBody_base.moveVertical(217);
        dogBody_base.moveHorizontal(305);
        dogBody_base.changeSize(180, 240);
        dogBody_base.changeColor("brown");
        
        leg_1.makeVisible();
        leg_1.moveVertical(410);
        leg_1.moveHorizontal(310);
        leg_1.changeSize(50, 65);
        leg_1.changeColor("black");
        
        leg_2.makeVisible();
        leg_2.moveVertical(410);
        leg_2.moveHorizontal(427);
        leg_2.changeSize(50, 65);
        leg_2.changeColor("black");
        
        leg_3.makeVisible();
        leg_3.moveVertical(400);
        leg_3.moveHorizontal(350);
        leg_3.changeSize(40, 50);
        leg_3.changeColor("black");
        
        leg_4.makeVisible();
        leg_4.moveVertical(400);
        leg_4.moveHorizontal(395);
        leg_4.changeSize(40, 50);
        leg_4.changeColor("black");
        
        dogHead_outline.makeVisible();
        dogHead_outline.moveVertical(85);
        dogHead_outline.moveHorizontal(299);
        dogHead_outline.changeSize(192, 185);
        dogHead_outline.changeColor("black");
        
        dogHead_base.makeVisible();
        dogHead_base.moveVertical(92);
        dogHead_base.moveHorizontal(305);
        dogHead_base.changeSize(180, 168);
        dogHead_base.changeColor("brown");
        
        eye_1.makeVisible();
        eye_1.moveVertical(149);
        eye_1.moveHorizontal(347);
        eye_1.changeSize(21, 41);
        eye_1.changeColor("black");
        
        eye_2.makeVisible();
        eye_2.moveVertical(149);
        eye_2.moveHorizontal(419);
        eye_2.changeSize(21, 41);
        eye_2.changeColor("black");
        
        blink.makeVisible();
        blink.moveVertical(120);
        blink.moveHorizontal(300);
        blink.changeSize(110, 41);
        blink.changeColor("brown");
        
        ear_1.makeVisible();
        ear_1.moveVertical(175);
        ear_1.moveHorizontal(277);
        ear_1.changeSize(-50, 50);
        ear_1.changeColor("black");
        
        ear_2.makeVisible();
        ear_2.moveVertical(175);
        ear_2.moveHorizontal(453);
        ear_2.changeSize(-50, 50);
        ear_2.changeColor("black");
        
        dogSnout_ouline.makeVisible();
        dogSnout_ouline.moveVertical(180);
        dogSnout_ouline.moveHorizontal(300);
        dogSnout_ouline.changeSize(190, 85);
        dogSnout_ouline.changeColor("black");
        
        dogSnout_base.makeVisible();
        dogSnout_base.moveVertical(182);
        dogSnout_base.moveHorizontal(304);
        dogSnout_base.changeSize(180, 79);
        dogSnout_base.changeColor("brown");

        nose.makeVisible();
        nose.moveVertical(263);
        nose.moveHorizontal(363);
        nose.changeSize(-28, 28);
        nose.changeColor("black");
        
        mouthOutline_1.makeVisible();
        mouthOutline_1.moveVertical(215);
        mouthOutline_1.moveHorizontal(365);
        mouthOutline_1.changeSize(28, 28);
        mouthOutline_1.changeColor("black");
        
        mouth_1.makeVisible();
        mouth_1.moveVertical(213);
        mouth_1.moveHorizontal(365);
        mouth_1.changeSize(28, 28);
        mouth_1.changeColor("brown");
        
        mouthOutline_2.makeVisible();
        mouthOutline_2.moveVertical(215);
        mouthOutline_2.moveHorizontal(392);
        mouthOutline_2.changeSize(28, 28);
        mouthOutline_2.changeColor("black");
        
        mouth_2.makeVisible();
        mouth_2.moveVertical(213);
        mouth_2.moveHorizontal(392);
        mouth_2.changeSize(28, 28);
        mouth_2.changeColor("brown");
        
        //  Make it look like blink
        blink.slowMoveVertical(32);
        blink.slowMoveVertical(-32);
        
        //  Make it look like blink
        blink.slowMoveVertical(32);
        blink.slowMoveVertical(-32);
    }
}
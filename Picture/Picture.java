
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square door;
    private Triangle roof;
    private Circle window;
    private Triangle treeTop;
    private Triangle treeMiddle;
    private Triangle treeBottom;
    private Square treeBase;
    private Circle sun;
    private Circle sun2;
    private Circle settingSun;
    private Square background;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        this.draw(); // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this treehouse.
     */
    public void draw()
    {
        background = new Square();
        background.changeColor("blue");
        background.changeSize(400);
        background.moveHorizontal(-50);
        background.moveVertical(-60);
        background.makeVisible();
        
        treeTop = new Triangle();
        treeTop.changeSize(40, 70);
        treeTop.moveHorizontal(65);
        treeTop.moveVertical(10);
        treeTop.makeVisible();
        
        treeMiddle = new Triangle();
        treeMiddle.changeSize(120, 130);
        treeMiddle.moveHorizontal(66);
        treeMiddle.moveVertical(45);
        treeMiddle.makeVisible();
        
        treeBottom = new Triangle();
        treeBottom.changeSize(140, 180);
        treeBottom.moveHorizontal(65);
        treeBottom.moveVertical(125);
        treeBottom.makeVisible();
        
        treeBase = new Square();
        treeBase.changeColor("green");
        treeBase.moveHorizontal(42);
        treeBase.moveVertical(215);
        treeBase.makeVisible();
        
        wall = new Square();
        wall.changeColor("magenta");
        wall.moveVertical(70);
        wall.moveHorizontal(31);
        wall.changeSize(48);
        wall.makeVisible();
        
        door = new Square();
        door.changeColor("blue");
        door.changeSize(25);
        door.moveHorizontal(42);
        door.moveVertical(92);
        door.makeVisible();
        
        roof = new Triangle();
        roof.changeColor("blue");
        roof.changeSize(24, 58);
        roof.moveHorizontal(65);
        roof.moveVertical(83);
        roof.makeVisible();
        
        window = new Circle();
        window.changeColor("blue");
        window.moveHorizontal(89);
        window.moveVertical(64);
        window.changeSize(13);
        window.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(200);
        sun.moveVertical(-50);
        sun.changeSize(50);
        sun.makeVisible();
      
        sun2 = new Circle();  //this makes the sun stay up for a bit
        sun2.makeVisible();
        sun2.moveHorizontal(250);
        sun2.moveVertical(-50);
        sun2.changeSize(20);
        sun2.slowMoveVertical(300);
        sun2.makeInvisible();
        
        sunset();
    }

    
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            
            background.changeColor("white");
            treeTop.changeColor("black");
            treeMiddle.changeColor("black");
            treeBottom.changeColor("black");
            treeBase.changeColor("black");
            wall.changeColor("white");
            door.changeColor("black");
            roof.changeColor("white");
            window.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            background.changeColor("blue");
            treeTop.changeColor("green");
            treeMiddle.changeColor("green");
            treeBottom.changeColor("green");
            treeBase.changeColor("green");
            wall.changeColor("magenta");
            door.changeColor("blue");
            roof.changeColor("blue");
            window.changeColor("blue");
            sun.changeColor("yellow");
            sun.makeVisible();
            
        }
    }

    /**
     * Method to draw sunset
     */
    public void sunset()
    {
            settingSun = new Circle();
            sun.makeInvisible();
            settingSun.changeColor("magenta");
            settingSun.moveHorizontal(200);
            settingSun.moveVertical(-50);
            settingSun.changeSize(50);
            settingSun.makeVisible();
            settingSun.slowMoveVertical(300);
            
            background.changeColor("black");
            treeTop.changeColor("white");
            treeMiddle.changeColor("white");
            treeBottom.changeColor("white");
            treeBase.changeColor("white");
            wall.changeColor("black");
            door.changeColor("white");
            roof.changeColor("black");
            window.changeColor("white");
    }
}



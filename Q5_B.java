import greenfoot.*;

/**
 * Write a description of class Q5_B here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Q5_B extends World
{

    /**
     * Constructor for objects of class Q5_B.
     * 
     */
    public Q5_B()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
            public void act() 
    {
        
    //if (Greenfoot.isKeyDown("left"))
    if (Greenfoot.mouseClicked(null))

        {
       Greenfoot.setWorld(new Q6());
    }
  }
}

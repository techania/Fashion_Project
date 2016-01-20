import greenfoot.*;

/**
 * Write a description of class Q2_C here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Q2_C extends World
{

    /**
     * Constructor for objects of class Q2_C.
     * 
     */
    public Q2_C()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
            public void act() 
    {
        
    //if (Greenfoot.isKeyDown("left"))
    if (Greenfoot.mouseClicked(null))

        {
       Greenfoot.setWorld(new Q3());
    }
    }
}

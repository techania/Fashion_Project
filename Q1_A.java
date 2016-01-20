import greenfoot.*;

/**
 * Write a description of class Q1_A here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Q1_A extends World
{

    /**
     * Constructor for objects of class Q1_A.
     * 
     */
    public Q1_A()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
        public void act() 
    {
        
    //if (Greenfoot.isKeyDown("left"))
    if (Greenfoot.mouseClicked(null))

        {
       Greenfoot.setWorld(new Q2());
    }
    }
}

import greenfoot.*;

/**
 * Write a description of class Q7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Q7 extends World
{

    /**
     * Constructor for objects of class Q7.
     * 
     */
    public Q7()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(913, 515, 1); 
    }
     public void act() 
    {
        
    //if (Greenfoot.isKeyDown("left"))
    if (Greenfoot.isKeyDown("a"))

        {
       Greenfoot.setWorld(new Q7_A());
    }
        if (Greenfoot.isKeyDown("b"))

        {
       Greenfoot.setWorld(new Q7_B());
    }
        if (Greenfoot.isKeyDown("c"))

        {
       Greenfoot.setWorld(new Q7_C());
    }
}
}

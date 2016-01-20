import greenfoot.*;

/**
 * Write a description of class Q8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Q8 extends World
{

    /**
     * Constructor for objects of class Q8.
     * 
     */
    public Q8()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(913, 515, 1); 
    }
         public void act() 
    {
        
    //if (Greenfoot.isKeyDown("left"))
    if (Greenfoot.isKeyDown("a"))

        {
       Greenfoot.setWorld(new Q8_A());
    }
        if (Greenfoot.isKeyDown("b"))

        {
       Greenfoot.setWorld(new Q8_B());
    }
        if (Greenfoot.isKeyDown("b"))

        {
       Greenfoot.setWorld(new Q8_C());
    }
}
}

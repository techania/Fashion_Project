import greenfoot.*;

/**
 * Write a description of class Directions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Directions extends World
{

    /**
     * Constructor for objects of class Directions.
     * 
     */
    public Directions()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(913, 515, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        //Tester tester = new Tester();
        //addObject(tester, 233, 169);
    }
    public void act() 
    {
        
    //if (Greenfoot.isKeyDown("left"))
    if (Greenfoot.mouseClicked(null))

        {
       Greenfoot.setWorld(new Q1());
    }
}
}

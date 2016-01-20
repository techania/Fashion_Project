import greenfoot.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
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
    //if (Greenfoot.isKeyDown("right"))
    if (Greenfoot.mouseClicked(null))

        {
       Greenfoot.setWorld(new Directions());
    }
}
}

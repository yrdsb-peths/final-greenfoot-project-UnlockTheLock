import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        // Create a new world with 1024x768 cells with a cell size of 1x1 pixels.
        // Make it so Flappy bird can fall into the void
        super(1024, 768, 1, false);
        FlappyBird flappy = new FlappyBird();
        //Add Flappy bird to the world
        addObject(flappy, 200, getHeight()/2);
    }
    
    int counter = 0;
    
    public void act()
    {
        counter++;
        if (counter ==100)
        {
            BottomPipe botPipe = new BottomPipe();
            addObject(botPipe, getWidth()*2, getHeight()*2);
            counter = 0;
        }
    }
}

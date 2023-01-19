import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Bottom Pipe is the pipe that appears on the bottom half of the map that
 * Flappy Bird is supposed to avoid.
 * 
 * @author Trevor
 * @version January 18, 2023
 */
public class BottomPipe extends Actor
{
    /**
     * Act - do whatever the BottomPipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation( getX() -4, getY() );
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Flappy Bird! A bird that the player controls and uses his flight to dodge 
 * tubes and stay alive.
 * 
 * @author Trevor
 * @version January 18, 2023
 */
public class FlappyBird extends Actor
{
    // Adjusting Flappy Bird's proportions.
    public FlappyBird()
    {
        GreenfootImage flappy = getImage();
        int myNewHeight = flappy.getHeight()*2;
        int myNewWidth = flappy.getWidth();
        flappy.scale(myNewHeight, myNewWidth);
    }
    
    double dy = 0;
    double g = 0.5;
    
    private void rotateFlappyBird()
        {
            if (Greenfoot.isKeyDown("space") == true)
            {
                dy = -7;
            }
        
            if (dy > -5 && dy <5)
            {
                setRotation(0);
            }
        
            else if (dy > 6 && dy < 10)
            {
                setRotation(30);
            }
        
            else if (dy > 11 && dy < 16)
            {
                setRotation(60);
            }
        
            else if (dy > 17 && dy <180)
            {
                setRotation(75);
            }
        
            else if (dy <-6 && dy >-10)
            {
                setRotation(-30);
            }
        
            else if (dy <-11 && dy >-16)
            {
                setRotation(-60);
            }
        
            else if (dy <-17 && dy >-180)
            {
                setRotation(-75);
            }
        }
    
    public void act() 
    {
        setLocation( getX(), (int) (getY() + dy) );
        
        //If the player presses the space bar, this code will launch the bird upwards.
        rotateFlappyBird();
        
        //If FlappyBird touches pipe, then show "Game Over".
        if (getOneIntersectingObject(BottomPipe.class) != null)
        {
            GameOverScreen gameOver = new GameOverScreen();
            getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
            
        }
        
        if (getOneIntersectingObject(TopPipe.class) != null)
        {
            GameOverScreen gameOver = new GameOverScreen();
            getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
            
        }
        
        //If FlappyBird drops out of the world or flies out of the world, show "Game Over".
        if (getY() > getWorld().getHeight())
        {
            GameOverScreen gameOver = new GameOverScreen();
            getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
        dy = dy + g;
    }    
    
    
}

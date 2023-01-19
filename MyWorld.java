import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Flappy Bird Game
 * 
 * @author Trevor
 * @version January 18, 2023
 */
public class MyWorld extends World
{
    int pipeCounter = 0;
    int score = 0;
    int gap = 400;
    int position = Greenfoot.getRandomNumber(18);
    int flappyCounter = 0;
    Score score1 = null;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        // Make it so Flappy bird can fall into the void
        super(600, 400, 1, false);
        FlappyBird flappy = new FlappyBird();
        //Add Flappy bird to the world
        addObject(flappy, 150, getHeight()/2);
        //Add score
        score1 = new Score();
        score1.setScore(0);
        addObject(score1, 100, 100);
        // Creating a label
        
    }
    
    public void act()
    {
        pipeCounter++;
        if (pipeCounter % 100 == 0)
        {
            BottomPipe botPipe = new BottomPipe();
            TopPipe topPipe = new TopPipe();
            
            GreenfootImage bImage = botPipe.getImage();
            GreenfootImage tImage = topPipe.getImage();
            
            addObject(botPipe, getWidth(), getHeight() + position);
            addObject(topPipe, botPipe.getX(), botPipe.getY() - gap);
        }
        
        if (pipeCounter >= 220)
        {
            if (flappyCounter % 100 == 0)
            {
                score++;
                score1.setScore(score);
            }
            flappyCounter++;
        }
    }
}

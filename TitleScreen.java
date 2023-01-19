import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The title screen before entering the game, along with instructions on
 * how to play.
 * 
 * @author Trevor
 * @version January 18, 2023
 */
public class TitleScreen extends World
{
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    public void act()
    {
        // Start the game if the player presses the p key.
        if(Greenfoot.isKeyDown("p"))
        {
            MyWorld FlappyWorld = new MyWorld();
            Greenfoot.setWorld (FlappyWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        FlappyBird flappyBird = new FlappyBird();
        addObject(flappyBird,296,201);
        BottomPipe bottomPipe = new BottomPipe();
        addObject(bottomPipe,293,358);
        Label label = new Label("Press <P> to play!", 25);
        addObject(label,295,257);
        Label label2 = new Label("Press or hold <space> to jump!", 25);
        addObject(label2,295,278);
        FlappyBirdTitleScreen flappyBirdTitleScreen = new FlappyBirdTitleScreen();
        addObject(flappyBirdTitleScreen,306,106);
        removeObject(flappyBird);
        removeObject(bottomPipe);
        flappyBirdTitleScreen.setLocation(293,215);
        flappyBirdTitleScreen.setLocation(461,120);
        removeObject(flappyBirdTitleScreen);
        FlappyBirdTitleScreen flappyBirdTitleScreen2 = new FlappyBirdTitleScreen();
        addObject(flappyBirdTitleScreen2,303,185);
    }
}

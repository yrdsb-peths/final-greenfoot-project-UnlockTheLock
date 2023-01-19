import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The tally at the top left of the screen that counts your current Flappy
 * Bird score.
 * 
 * @author Trevor
 * @version January 18, 2023
 */
public class Score extends Actor
{
        //Create a counter on Flappy Bird game
        public Score()
        {
            GreenfootImage newImage = new GreenfootImage(100, 50);
            setImage(newImage);
        }
        
        public void setScore(int score)
        {
            GreenfootImage newImage = getImage();
            newImage.clear();
            Font f = new Font("Arial", 32);
            newImage.setFont(f);
            newImage.drawString("" + score, 30, 30);
            setImage(newImage);
        }
}

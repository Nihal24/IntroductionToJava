import greenfoot.*;
import java.awt.Color;

public class Regularbrick extends Brick
{
public Regularbrick()
{
    GreenfootImage image = new GreenfootImage (40, 20);
    image.setColor(Color.red);
    image.fillRect(0, 0, 40, 20);
    image.setColor(Color.black);  
    image.fillOval(10, 2, 20, 8);
    image.fillRect(15, 9, 10, 8);
    image.setColor(Color.white);
    image.fillOval(12, 4, 4, 4);
    setImage(image);
}
  
    public int getScoreValue() 
    {
       return -1100;

}              
}                      
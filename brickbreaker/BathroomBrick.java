import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class BathroomBrick extends Brick
{
    public BathroomBrick()
    {
       getImage().scale(50, 30); 
    }    
  
   public int getScoreValue()
   {
       return 100;
   }   
}

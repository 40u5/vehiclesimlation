import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class walker extends Pedestrian
{
    public walker(int direction)
    {
        super(direction);
        maxSpeed = 1;
        speed = maxSpeed;
    }
    
    public void act()
    {
        move(direction, speed);
    }
}

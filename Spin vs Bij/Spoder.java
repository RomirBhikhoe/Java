import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spoder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spoder extends Actor
{
    /**
     * Act - do whatever the Spoder wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Spoder() {
        getImage().scale(100, 100);
    }
    
    public void act()
    {
        // Add your action code here.
        checkKeyboard();
        isHit();
    }
    
    public void isHit() {
        if(isTouching(Bee.class)) {
            removeTouching(Bee.class);
            
            MyWorld w=(MyWorld)getWorld();
            Bee myBee=new Bee();
            Bee myBee2=new Bee();
            w.addObject(myBee, Greenfoot.getRandomNumber(600)+100, Greenfoot.getRandomNumber(600)+100);
            w.addObject(myBee2, Greenfoot.getRandomNumber(600)+100, Greenfoot.getRandomNumber(600)+100);
            w.eatBee();
        }
    }
    
    public void checkKeyboard() {
    boolean key=Greenfoot.isKeyDown("d");
        if (key == true) {
            setLocation(getX()+4, getY());
            turn(5);
        }
        
        key=Greenfoot.isKeyDown("a");
        if (key == true) {
            setLocation(getX()-4, getY());
            turn(5);
        }
        
        key=Greenfoot.isKeyDown("w");
        if (key == true) {
            setLocation(getX(), getY()-4);
            turn(5);
        }
        
        key=Greenfoot.isKeyDown("s");
        if (key == true) {
            setLocation(getX(), getY()+4);
            turn(5);
        }
        
        key=Greenfoot.isKeyDown("r");
        if (key == true) {
            turn(80);
        }
    }

}


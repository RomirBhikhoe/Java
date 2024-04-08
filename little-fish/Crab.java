import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Crab extends Animal
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        checkKeyBoard();
        hitFish();
    }
    
    public Crab() {
        getImage().scale(100, 100);
    }
    
    public void checkKeyBoard() {
        boolean key = Greenfoot.isKeyDown("d");
        if (key == true) {
            turnTowards(getX()+2, getY());
            setLocation(getX()+2, getY());
        }
        
        key = Greenfoot.isKeyDown("a");
        if (key == true) {
            turnTowards(getX()-2, getY());
            setLocation(getX()-2, getY());
        }
        
        key = Greenfoot.isKeyDown("w");
        if (key == true) {
            turnTowards(getX(), getY()-2);
            setLocation(getX(), getY()-2);
        }
        
        key = Greenfoot.isKeyDown("s");
        if (key == true) {
            turnTowards(getX(), getY()+2);
            setLocation(getX(), getY()+2);
        }
    }
    
    public void hitFish() {
        Actor fish = getOneIntersectingObject(Fish.class);
         if (fish != null) {
             getWorld().removeObject(fish);
             FishWorld myWorld = (FishWorld) getWorld();
             myWorld.updateScore();
         }
    }
    
    
}

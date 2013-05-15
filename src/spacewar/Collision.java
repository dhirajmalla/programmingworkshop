package spacewar;

import java.awt.Rectangle;
import java.util.ArrayList;

/**
 * The Collision detection class
 * @author Team  Dhiraj  and Ioana
 * @version 1.0
 */
public class Collision {
    private boolean returnValue;
    
    public Collision(){
            returnValue= false;
    }
   
    /**
     * This checks the collision between ship and alien
     * returns true if the collision occurs between them
     * @param ship
     *                  object ship
     * @param aliens
     *                  arraylist aliens
     * @param location
     *              object Location
     * @param endDisplay
     *              object EndDisplay
     * @return 
     *          return boolean value
     */
    public  boolean checkCollisionShipAlien(Ship ship, ArrayList aliens,Mord location,EndDisplay endDisplay){
    
        Rectangle shipRectangle = ship.getBounds();
        
        for (int j = 0; j<aliens.size(); j++) {
            Alien a = (Alien) aliens.get(j);
            Rectangle aliensRectangle = a.getBounds();

            if (shipRectangle.intersects(aliensRectangle)) {
                 Sound.BOOM.play();
                aliens.remove(j);
                ship.setEnergyLevel(0);
                ship.setCanMove(false);
                location.setCanMoveI(false);
                endDisplay.setVisible(true);                

                for (int k = 0; k<aliens.size(); k++) {
                    Alien ak = (Alien) aliens.get(k);
                    ak.setCanMove(false);
                }
                returnValue=true;
                break;
            }
        }
        
        return returnValue;
    }
    
   /**
     * This checks the collision between bullet and alien
     * returns true if the collision occurs between them
     * 
     * @param ship
     *                  object ship
     * @param aliens
     *                  ArrayList aliens
     * @param bullets
     *                  ArrayList bullets
     * @return 
     *          return boolean value
     */
    
    public boolean checkCollisionBulletAlien(Ship ship, ArrayList bullets, ArrayList aliens){

        bullets = ship.getBullets();
        for (int i = 0; i < bullets.size(); i++) {
            Bullet m = (Bullet) bullets.get(i);

            Rectangle bulletRectangle = m.getBounds();

            for (int j = 0; j<aliens.size(); j++) {
                Alien a = (Alien) aliens.get(j);
                Rectangle aliensRectangle = a.getBounds();

                if (bulletRectangle.intersects(aliensRectangle) && m.isVisible()) {
                    aliens.remove(j);
                    bullets.remove(i);
                    returnValue=true;
                    break;
                }
            }        
        }    
        return returnValue;
    }
}

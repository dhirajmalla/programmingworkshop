package spacewar;

import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Dhiraj and Ioana
 */
public class CollisionTest {
    
      /**
     * Test of checkCollisionShipAlien method, of class Collision.
     */
    @Test
    public void testCheckCollisionShipAlien() {
        System.out.println("checkCollisionShipAlien");
        Ship ship = new Ship();
        ArrayList aliens = new ArrayList();
        aliens.add(new Alien(10,400,2,3,1));
        Mord location = new Mord();
        EndDisplay endDisplay = new EndDisplay(100,400);
        Collision instance = new Collision();
        boolean expResult = true;
        boolean result = instance.checkCollisionShipAlien(ship, aliens, location, endDisplay);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkCollisionBulletAlien method, of class Collision.
     */
    @Test
    public void testCheckCollisionBulletAlien() {
        System.out.println("checkCollisionBulletAlien");
        Ship ship = new Ship();
        ArrayList bullets = new ArrayList();
        bullets.add(new Bullet(40,110));
        ArrayList aliens =new ArrayList();
        aliens.add(new Alien(50,120,2,3,1));
        Collision instance = new Collision();
        boolean expResult = false;
        boolean result = instance.checkCollisionBulletAlien(ship, bullets, aliens);
        assertEquals(expResult, result);
    }
}

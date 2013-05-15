/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spacewar;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Dhira and Ioana
 */
public class BulletTest {
    
    public BulletTest() {
    }
    
  

    /**
     * Test of setImage method, of class Bullet.
     */
    @Test
    public void testSetImage() {
        System.out.println("setImage");
        ImageIcon li = new ImageIcon(this.getClass().getResource("\\picture\\bullet.png"));
        Bullet instance = new Bullet(100,200);
        instance.setImage(li);
        
        Image expResult = li.getImage();
        Image result = instance.getImage();
        assertEquals(expResult, result);
    }

    /**
     * Test of setX method, of class Bullet.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int xValue = 10;
        Bullet instance = new Bullet(100,200);
        instance.setX(xValue);
        
        int expResult=10;
        int result = instance.getX();
        assertEquals(expResult, result);        
    }

    /**
     * Test of setY method, of class Bullet.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        int yValue = 30;
        Bullet instance = new Bullet(100,200);
        instance.setY(yValue);
            
        int expResult=30;
        int result = instance.getY();
        assertEquals(expResult, result);
    }

    /**
     * Test of setVisible method, of class Bullet.
     */
    @Test
    public void testSetVisible() {
        System.out.println("setVisible");
        Boolean visible = true;
        Bullet instance = new Bullet(100,200);
        instance.setVisible(visible);
        
        boolean expResult = true;
        boolean result = instance.isVisible();
        assertEquals(expResult, result);      
    }

    /**
     * Test of getX method, of class Bullet.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Bullet instance = new Bullet(100,200);
        int expResult = 100;
        int result = instance.getX();
        assertEquals(expResult, result);
    }

    /**
     * Test of getY method, of class Bullet.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Bullet instance = new Bullet(100,200);
        int expResult = 200;
        int result = instance.getY();
        assertEquals(expResult, result);
    }

    /**
     * Test of isVisible method, of class Bullet.
     */
    @Test
    public void testIsVisible() {
        System.out.println("isVisible");
        Bullet instance = new Bullet(100,200);
        boolean expResult = true;
        boolean result = instance.isVisible();
        assertEquals(expResult, result);
    }

    /**
     * Test of getImage method, of class Bullet.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        Bullet instance = new Bullet(100,200);
        Image expResult = null;
        Image result = instance.getImage();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBounds method, of class Bullet.
     */
    @Test
    public void testGetBounds() {
        System.out.println("getBounds");
        Bullet instance = new Bullet(100,200);
        Rectangle expResult = new Rectangle(100,200,10,4);
        Rectangle result = instance.getBounds();
        assertEquals(expResult, result);
    }

    /**
     * Test of move method, of class Bullet.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Bullet instance = new Bullet(100,200);
        instance.move();
    }
}

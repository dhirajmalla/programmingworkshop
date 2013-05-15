package spacewar;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Team Dhiraj and Ioana
 */
public class AlienTest {
    
    public AlienTest() {
    }

    /**
     * Test of setImage method, of class Alien.
     */
    @Test
    public void testSetImage() {
        System.out.println("setImage");
        ImageIcon li =  new ImageIcon(this.getClass().getResource("\\picture\\alien1.png"));
        Alien instance =  new Alien (1000,35,1,2,0);
        instance.setImage(li);
        
        Image expResult = li.getImage();
        Image result = instance.getImage();
        assertEquals(expResult, result);
    }

    /**
     * Test of setVisible method, of class Alien.
     */
    @Test
    public void testSetVisible() {
        System.out.println("setVisible");
        boolean visible = false;
        Alien instance =  new Alien (1000,35,1,2,0);
        instance.setVisible(visible);
        
        boolean expResult = false;
        boolean result = instance.isVisible();
        assertEquals(expResult, result);   
        
    }

    
    /**
     * Test of setX method, of class Alien.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int xValue=1000;
        Alien instance = new Alien (1000,35,1,2,0);
        instance.setX(xValue);
        
        int expResult=1000;
        int result = instance.getX();
        assertEquals(expResult, result);
    }

    /**
     * Test of setY method, of class Alien.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        int yValue = 0;
        Alien instance = new Alien (1000,35,1,2,0);
        instance.setY(yValue);
        
        int expResult=35;
        int result = instance.getY();
        assertEquals(expResult, result);
    }

    /**
     * Test of getX method, of class Alien.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Alien instance = new Alien (1000,35,1,2,0);
        int expResult = 1000;
        int result = instance.getX();
        assertEquals(expResult, result);

    }

    /**
     * Test of getY method, of class Alien.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Alien instance =new Alien (1000,35,1,2,0);
        int expResult = 35;
        int result = instance.getY();
        assertEquals(expResult, result);

    }

    /**
     * Test of getAliensType method, of class Alien.
     */
    @Test
    public void testGetAliensType() {
        System.out.println("getAliensType");
        Alien instance = new Alien (1000,35,1,2,0);
        int expResult = 1;
        int result = instance.getAliensType();
        assertEquals(expResult, result);

    }

    /**
     * Test of isVisible method, of class Alien.
     */
    @Test
    public void testIsVisible() {
        System.out.println("isVisible");
        Alien instance = new Alien (1000,35,1,2,0);
        boolean expResult = true;
        boolean result = instance.isVisible();
        assertEquals(expResult, result);

    }

    /**
     * Test of getImage method, of class Alien.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        Alien instance =new Alien (1000,35,1,2,0);
         ImageIcon li =  new ImageIcon(this.getClass().getResource("\\picture\\alien1.png"));
        instance.setImage(li);

        Image expResult = li.getImage();
        Image result = instance.getImage();
        assertEquals(expResult, result);

    }

    /**
     * Test of getBounds method, of class Alien.
     */
    @Test
    public void testGetBounds() {
        System.out.println("getBounds");
        Alien instance = new Alien (1000,35,1,2,0);
        Rectangle expResult = new Rectangle(1000, 35, 40,20);
        Rectangle result = instance.getBounds();
        assertEquals(expResult, result);

    }

    /**
     * Test of move method, of class Alien.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Alien instance = new Alien (1000,35,1,2,0);
        instance.move();
    }
}

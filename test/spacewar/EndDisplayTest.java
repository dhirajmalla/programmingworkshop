package spacewar;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Dhiraj and Ioana
 */
public class EndDisplayTest {
    
    public EndDisplayTest() {
    }
    
    
    /**
     * Test of setImage method, of class EndDisplay.
     */
    @Test
    public void testSetImage() {
        System.out.println("setImage");
        ImageIcon li = new ImageIcon(this.getClass().getResource("\\picture\\enddisplay.jpg"));;
        EndDisplay instance = new EndDisplay(100,400);
        instance.setImage(li);
      
        Image expResult = li.getImage();
        Image result = instance.getImage();
        assertEquals(expResult, result);
    }

    /**
     * Test of setX method, of class EndDisplay.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int xValue = 300;
        EndDisplay instance = new EndDisplay(100,400);
        instance.setX(xValue);
        
        int expResult=300;
        int result = instance.getX();
        assertEquals(expResult, result);
    }

    /**
     * Test of setY method, of class EndDisplay.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        int yValue = 200;
        EndDisplay instance = new EndDisplay(100,400);
        instance.setY(yValue);
        
        int expResult=200;
        int result = instance.getY();
        assertEquals(expResult, result);
    }

    /**
     * Test of setVisible method, of class EndDisplay.
     */
    @Test
    public void testSetVisible() {
        System.out.println("setVisible");
        Boolean visible = true;
        EndDisplay instance = new EndDisplay(100,400);
        instance.setVisible(visible);
       
        boolean expResult = true;
        boolean result = instance.isVisible();
        assertEquals(expResult, result);   
         }

    /**
     * Test of getX method, of class EndDisplay.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        EndDisplay instance = new EndDisplay(100,400);
        int expResult = 100;
        int result = instance.getX();
        assertEquals(expResult, result);

    }

    /**
     * Test of getY method, of class EndDisplay.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        EndDisplay instance = new EndDisplay(100,400);
        int expResult = 400;
        int result = instance.getY();
        assertEquals(expResult, result);

    }

    /**
     * Test of isVisible method, of class EndDisplay.
     */
    @Test
    public void testIsVisible() {
        System.out.println("isVisible");
        EndDisplay instance =new EndDisplay(100,400);
        boolean expResult = false;
        boolean result = instance.isVisible();
        assertEquals(expResult, result);
    }

    /**
     * Test of getImage method, of class EndDisplay.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        EndDisplay instance = new EndDisplay(100,400);
        Image expResult = null;
        Image result = instance.getImage();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBounds method, of class EndDisplay.
     */
    @Test
    public void testGetBounds() {
        System.out.println("getBounds");
        EndDisplay instance = new EndDisplay(100,400);
        Rectangle expResult = new Rectangle(100,400,10,10);
        Rectangle result = instance.getBounds();
        assertEquals(expResult, result);
    }
}

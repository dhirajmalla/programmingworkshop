package spacewar;

import java.awt.Image;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Dhiraj and Ioana
 */
public class MordTest {
    
    public MordTest() {
    }
    
 

    /**
     * Test of getX method, of class Mord.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Mord instance = new Mord();
        int expResult =  instance.getX();
        int result = instance.getX();
        assertEquals(expResult, result);
    }

    /**
     * Test of getY method, of class Mord.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Mord instance = new Mord();
        int expResult = instance.getY();
        int result = instance.getY();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getImage method, of class Mord.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        Mord instance = new Mord();
        Image expResult = instance.getImage();
        Image result = instance.getImage();
        assertEquals(expResult, result);
       
    }
}

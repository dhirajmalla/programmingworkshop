/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spacewar;

import java.awt.Image;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author ioanajuja
 */
public class AlienTest {
    
    public AlienTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of move method, of class Alien.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Alien instance = new Alien();
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setX method, of class Alien.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int xValue = 0;
        Alien instance = new Alien();
        instance.setX(xValue);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setY method, of class Alien.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        int yValue = 0;
        Alien instance = new Alien();
        instance.setY(yValue);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getX method, of class Alien.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Alien instance = new Alien();
        int expResult = instance.getX();
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getY method, of class Alien.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Alien instance = new Alien();
        int expResult = instance.getY();
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getImage method, of class Alien.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        Alien instance = new Alien();
        Image expResult = instance.getImage();
        Image result = instance.getImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spacewar;

import java.awt.Image;
import java.awt.event.KeyEvent;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * not fully implemented ; got some errors , we didn't know how to write
 * tests for keyboard input
 */
public class ShipTest {
    
    public ShipTest() {
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
     * Test of move method, of class Ship.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Ship instance = new Ship();
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getX method, of class Ship.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Ship instance = new Ship();
        int expResult = instance.getX();
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getY method, of class Ship.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Ship instance = new Ship();
        int expResult = instance.getY();
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getImage method, of class Ship.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        Ship instance = new Ship();
        Image expResult =  instance.getImage();
        Image result = instance.getImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of keyPressed method, of class Ship.
     */
    @Test
    public void testKeyPressed() {
        System.out.println("keyPressed");
        KeyEvent e = null;
        Ship instance = new Ship();
        instance.keyPressed(e);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of keyReleased method, of class Ship.
     */
    @Test
    public void testKeyReleased() {
        System.out.println("keyReleased");
        KeyEvent e = null;
        Ship instance = new Ship();
        instance.keyReleased(e);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}

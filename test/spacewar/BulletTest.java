/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spacewar;

import java.awt.Image;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ioanajuja
 */
public class BulletTest {
    
    public BulletTest() {
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
     * Test of move method, of class Bullet.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Bullet instance = new Bullet();
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getX method, of class Bullet.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Bullet instance = new Bullet();
        int expResult = instance.getX();
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getY method, of class Bullet.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Bullet instance = new Bullet();
        int expResult = instance.getY();
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getImage method, of class Bullet.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        Bullet instance = new Bullet();
        Image expResult = instance.getImage();
        Image result = instance.getImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
}

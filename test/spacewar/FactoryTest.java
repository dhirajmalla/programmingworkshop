
package spacewar;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Dhiraj and Ioana
 */
public class FactoryTest {
    
    public FactoryTest() {
    }
    
    
    /**
     * Test of aliensType method, of class Factory.
     */
    @Test
    public void testAliensType() {
        System.out.println("aliensType");
        Factory instance = new Factory();
        int[] expResult = {
                                1,1,1, 1,1,1,1,1,1,1,
                                2,2,2,2,2,2,2,2,2,2,
                                3,3,3,3,3,3,3,3,3,3,
                                    }; 
        int[] result = instance.aliensType();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of aliensSpeed method, of class Factory.
     */
    @Test
    public void testAliensSpeed() {
        System.out.println("aliensSpeed");
        Factory instance = new Factory();
        int[] expResult =  {
                                2,2,2,2,2,2,2,2,2,2,
                                3,3,3,3,3,3,3,3,3,3,
                                4,4,4,4,4,4,4,4,4,4
                                    };
        int[] result = instance.aliensSpeed();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of aliensDirection method, of class Factory.
     */
    @Test
    public void testAliensDirection() {
        System.out.println("aliensDirection");
        Factory instance = new Factory();
        int[] expResult =  {
                                0,0,0,0,0,0,0,0,0,0,
                                0,0,0,0,0,0,0,0,0,0,
                                1,1,1,1,1,1,1,1,1,1
                                        }; 
        int[] result = instance.aliensDirection();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of aliensPosition method, of class Factory.
     */
    @Test
    public void testAliensPosition() {
        System.out.println("aliensPosition");
        Factory instance = new Factory();
        int[][] expResult =  { 
        {1000, 35}, {1000,105}, {1000, 175}, {1000, 245}, {1000, 315}, {1000, 385}, {1000, 455}, {1000, 525}, {1000, 595}, {1000, 665},
        {4000, 35}, {4050,105}, {4100, 175}, {4150, 245}, {4200, 315}, {4150, 385}, {4100, 455}, {4050, 525}, {4000, 595}, {4950, 665},
        {8000, 10}, {8050,80}, {8100, 150}, {8150, 220}, {8200, 290}, {8150, 360}, {8100, 430}, {8500, 500}, {8000, 570}, {8000, 640}
       };
        int[][] result = instance.aliensPosition();
        assertArrayEquals(expResult, result);
    }
}


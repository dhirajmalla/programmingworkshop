/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spacewar;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * not fully implemented ; we didn't know to write tests for the graphics g in testpaint()
 * 
 */
public class FantasiaTest {
    
    public FantasiaTest() {
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
     * Test of paint method, of class Fantasia.
     */
    @Test
    public void testPaint() {
        System.out.println("paint");
        Graphics g = null ;
        Fantasia instance = new Fantasia();
        instance.paint(g);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of actionPerformed method, of class Fantasia.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        Fantasia instance = new Fantasia();
        instance.actionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
    }
}

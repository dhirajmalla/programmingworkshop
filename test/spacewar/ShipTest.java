/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spacewar;

import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 *@author  Dhiraj and Ioana
 */
public class ShipTest {
    
    public ShipTest() {
    }

  
    /**
     * Test of getX method, of class Ship.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Ship instance = new Ship();
        int expResult = 10;
        int result = instance.getX();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getY method, of class Ship.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Ship instance = new Ship();
        int expResult = 400;
        int result = instance.getY();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getImage method, of class Ship.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        Ship instance = new Ship();
        ImageIcon li =  new ImageIcon(this.getClass().getResource("\\picture\\craft.png"));
        instance.setImage(li);

        Image expResult = li.getImage();
        Image result = instance.getImage();
        assertEquals(expResult, result);
    }

    /**
     * Test of setImage method, of class Ship.
     */
    @Test
    public void testSetImage() {
        System.out.println("setImage");
        Ship instance = new Ship();
        ImageIcon li =  new ImageIcon(this.getClass().getResource("\\picture\\craft.png"));
        instance.setImage(li);

        Image expResult = li.getImage();
        Image result = instance.getImage();
        assertEquals(expResult, result);
    }

    /**
     * Test of setVisible method, of class Ship.
     */
    @Test
    public void testSetVisible() {
        System.out.println("setVisible");
        boolean visible = false;
        Ship instance = new Ship();
        instance.setVisible(visible);
        
        boolean expResult=false;
        boolean result= instance.isVisible();
        assertEquals(expResult, result);        
    }

   
    /**
     * Test of setEnergyLevel method, of class Ship.
     */
    @Test
    public void testSetEnergyLevel() {
        System.out.println("setEnergyLevel");
        int energyLevel = 40;
        Ship instance = new Ship();
        instance.setEnergyLevel(energyLevel);
   
        int expResult=40;
        int result=instance.getEnergyLevel();
        assertEquals(expResult, result);                
    }

    /**
     * Test of getEnergyLevel method, of class Ship.
     */
    @Test
    public void testGetEnergyLevel() {
        System.out.println("getEnergyLevel");
        Ship instance = new Ship();
        int expResult = 100;
        int result = instance.getEnergyLevel();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBullets method, of class Ship.
     */
    @Test
    public void testGetBullets() {
        System.out.println("getBullets");
        
        ArrayList bullets = new ArrayList();
        bullets.add(new Bullet(10,20));
        int expResult=bullets.size();
        
        Ship instance = new Ship();
        instance.fire();
        ArrayList bulletReturns= instance.getBullets();
        int result = bulletReturns.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of isVisible method, of class Ship.
     */
    @Test
    public void testIsVisible() {
        System.out.println("isVisible");
        Ship instance = new Ship();
        boolean expResult = true;
        boolean result = instance.isVisible();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBounds method, of class Ship.
     */
    @Test
    public void testGetBounds() {
        System.out.println("getBounds");
        Ship instance = new Ship();
       Rectangle expResult = new Rectangle(10, 400, 40,20);
        Rectangle result = instance.getBounds();
        assertEquals(expResult, result);

    }

    /**
     * Test of fire method, of class Ship.
     */
    @Test
    public void testFire() {
        System.out.println("fire");
        Ship instance = new Ship();
        instance.fire();
    }

}

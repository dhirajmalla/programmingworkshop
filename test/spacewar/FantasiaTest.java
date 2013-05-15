/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spacewar;

import java.awt.event.ActionEvent;
import org.junit.Test;

/**
 * @author Dhiraj and Ioana
 * 
 */
public class FantasiaTest {
    
    public FantasiaTest() {
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
        Sound.SHOOT.play(); 

    }
   
}

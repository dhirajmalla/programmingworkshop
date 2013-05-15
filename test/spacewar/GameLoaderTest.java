/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spacewar;

import java.awt.event.ActionEvent;
import org.junit.Test;

/**
 *
 * @author Dhiraj and Ioana
 */
public class GameLoaderTest {
    
    public GameLoaderTest() {
    }
    
 

    /**
     * Test of main method, of class GameLoader.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GameLoader.main(args);
    }
    
    @Test
    public void testActionPerformed() {
        System.out.println("action Performed");
            ActionEvent e = null;
            GameLoader instance=new GameLoader();
        }
}

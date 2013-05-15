package spacewar;

import java.awt.Image;
import java.awt.Rectangle;

/**
 * Interface Players
 * @author Team  Dhiraj  and Ioana
 * @version 1.0
 */
public interface Player {
    
    int getX();
    
    int getY();
    
    /**
     *
     * @return boolean value of visible status of the player
     */
    boolean isVisible();
    
    Image getImage();
    
    Rectangle getBounds();
     
     void move();
}


package spacewar;

import java.awt.Image;
import javax.swing.ImageIcon;


public class Bullet {
    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;
   
    //Constructor
    public Bullet() {
        ImageIcon ii = new ImageIcon(this.getClass().getResource("\\picture\\bullet.png"));
        image = ii.getImage();
        // initial position of a bullet
        x = 400;
        y = 400;
    }

    // Method to move bullet
    public void move () {
            x += dx;
            y += dy;
     }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return image;
    }
}

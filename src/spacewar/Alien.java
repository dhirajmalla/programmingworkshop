
package spacewar;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Alien {
    private int dx;
    private int dy;
    private int x;
    private int y;
    private Boolean canMove;
    private Image image;

    //Constructor
    public Alien() {
        ImageIcon ii = new ImageIcon(this.getClass().getResource("\\picture\\alien.png"));
        image = ii.getImage();
        x = 50;
        y = 80;
        canMove = true;
    }

    //method to move aliens
    public void move() {
        if (canMove){
            x += dx;
            y += dy;
        }
     }
    
    
    public void setX(int xValue){
        x=xValue;
    }

    public void setY(int yValue){
        y=yValue;
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


package spacewar;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Alien {
    private int aliensSpeed;
    private int x;
    private int y;
    private Boolean canMove;
    private Image image;

    //Constructor
    public Alien() {
        aliensSpeed= 1;
        canMove = true;
    }

    //method to move aliens
    public void move() {
        if (canMove){
            x -= aliensSpeed;
        }
     }
    
   public void setImage(ImageIcon li){
      image=li.getImage();  
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

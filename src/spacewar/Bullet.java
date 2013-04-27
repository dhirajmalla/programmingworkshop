
package spacewar;

import java.awt.Image;
import javax.swing.ImageIcon;


public class Bullet {
    private int speedBullet;
    private int x;
    private int y;
    private Image image;
   
    //Constructor
    public Bullet(int x, int y) {

        // initial position of a bullet
        this.x = x;
        this.y = y;
        speedBullet=2;
        
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

    
    // Method to move bullet
    public void move () {
            x += speedBullet;
     }
}

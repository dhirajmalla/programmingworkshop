
package spacewar;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;


public class Bullet {
    private int speedBullet;
    private int x;
    private int y;
    private boolean visible;
    private Image image;
   
    //Constructor
    public Bullet(int x, int y) {

        // initial position of a bullet
        this.x = x;
        this.y = y;
        speedBullet=25;
        visible=true;
        
    }

     public void setImage(ImageIcon li){
      this.image=li.getImage();  
    }
   
    public void setX(int xValue){
        this.x=xValue;
    }

    public void setY(int yValue){
        this.y=yValue;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }    
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isVisible() {
        return visible;
    }

    public Image getImage() {
        return image;
    }

    public Rectangle getBounds() {
        //return new Rectangle(x, y, this.image.getWidth(null), this.image.getHeight(null));
        return new Rectangle(x, y, 10,4);
    } 

    // Method to move bullet
    public void move () {
            x += speedBullet;
            if (x > 1350){
                visible = false;
            }
    }
}

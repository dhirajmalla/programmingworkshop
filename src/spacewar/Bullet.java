
package spacewar;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 * This is the class for the bullet
 * @author Team  Dhiraj  and Ioana
 * @version 1.0
 */

public class Bullet implements Player{
    private int speedBullet;
    private int x;
    private int y;
    private boolean visible;
    private Image image;
   
    /**
     * 
     * @param x
     *          specified the x position of the bullet
     * @param y
     *          specified the y position of the bullet
     */         
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
    
    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public boolean isVisible() {
        return visible;
    }

    @Override
    public Image getImage() {
        return image;
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, y, 10,4);
    } 

    /**
     * Method to move bullet
     * 
     * */
     
    @Override
    public void move () {
            x += speedBullet;
            if (x > 1350){
                visible = false;
            }
    }

}

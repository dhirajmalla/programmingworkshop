
package spacewar;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 * This is Alien class
 * @author Team  Dhiraj  and Ioana
 * @version 1.0
 */

public class Alien implements Player{
    private int aliensSpeed;
    private double aliensDirection;
    private int x;
    private int y;
    private int aliensType;
    private Boolean visible;
    private Boolean canMove;
    private Image image;

    /**
     * This is Alien Constructor 
     * 
     * @param x
     *         Specified the x Position of Alien
     * @param y
     *          Specified the y Position of Alien
     * @param aliensType
     *          Specified the y Position of Alien
     * @param aliensSpeed
     *          Specified  the speed of the Alien
     * @param aliensDirection
     *          Specified the direction of the Alien
     */
    
    public Alien(int x, int y,int aliensType,int aliensSpeed, int aliensDirection) {
        this.x=x;
        this.y=y;
        this.aliensType=aliensType;
        this.aliensSpeed= aliensSpeed;
        this.aliensDirection=aliensDirection;
        visible=true;
        canMove = true;
    }

     /**
      *  set the image of Alien
      * @param li 
      *             specified the Image Icon
      */
    
   public void setImage(ImageIcon li){
      image=li.getImage();  
    }

/**
 * 
 * @param visible 
 */
   public void setVisible(boolean visible) {
        this.visible = visible;
    }

   public void setCanMove(boolean canMove) {
        this.canMove =canMove;
    }
   
    public void setX(int xValue){
        x=xValue;
    }

    public void setY(int yValue){
        y=yValue;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }
    
    public int getAliensType() {
        return aliensType;
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
        return new Rectangle(x, y, 40,20);
    }   

 /**
  * method to move aliens 
  * moves to left and direction provided
  * if aliens reaches - 5000 then it repositions in to 1500
  * some aliens moves up and down , therefore if it crosses more than 
  **/
    
    @Override
    public void move() {
        if (canMove){
            if (x <-5000){ 
                x = 1500;
            }
            if (y>600 || y<0){ 
                aliensDirection*=-1;
            }
            
            x -= aliensSpeed;
            y+=aliensDirection;
        }
    }

}

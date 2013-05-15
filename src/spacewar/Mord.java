
package spacewar;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * This is class for one of the city
 * @author Team  Dhiraj  and Ioana
 * @version 1.0
 */
public class Mord implements Level {
    private int x;
    private int y;
    private boolean canMove;
    private Image image;
    private int xImage2;
    private int yImage2;
    private Image image2;

    public Mord() {
        x = 0;
        y = 0;
        xImage2=8000;
        yImage2=0;
        canMove=true;
        
    }

  public void setImage(ImageIcon li){
      image=li.getImage();  
    }

  public void setCanMoveI(boolean canMove){
     this. canMove=canMove;  
    }
  
    @Override
  public int getX() {
        return x;
    }

  public int getXImage2() {
        return xImage2;
    }

    @Override
  public int getY() {
        return y;
    }

    @Override
    public Image getImage() {
        return image;
    } 
     /*
      * method to move background
      * x is the x position of background and move method changes the possition by -1 . if position of image is less than 1500 the it reposition at 0.
    */
    @Override
    public void move() {
        if (canMove){
            if (xImage2==0){
               x=0;
               xImage2=8000;
            }            
           x -=1;
           xImage2-=1;
        }
    }

}

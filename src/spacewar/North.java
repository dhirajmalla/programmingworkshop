
package spacewar;

import java.awt.Image;
import javax.swing.ImageIcon;

public class North {
    private int x;
    private int y;
    private Image image;
    private int xImage2;
    private int yImage2;
    private Image image2;

    public North() {
        x = 0;
        y = 0;
        xImage2=8000;
        yImage2=0;
        
    }

  public void setImage(ImageIcon li){
      image=li.getImage();  
    }

  public int getX() {
        return x;
    }

  public int getXImage2() {
        return xImage2;
    }

  public int getY() {
        return y;
    }

    public Image getImage() {
        return image;
    } 
     /*
      * method to move background
      * x is the x position of background and move method changes the possition by -1 . if position of image is less than 1500 the it reposition at 0.
    */
    public void move() {
        if (xImage2==0){
            x=0;
            xImage2=8000;
        }            
        x -=1;
        xImage2-=1;
    }
}
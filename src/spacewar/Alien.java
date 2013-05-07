
package spacewar;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class Alien {
    private int aliensSpeed;
    private double aliensDirection;
    private int x;
    private int y;
    private int aliensType;
    private Boolean visible;
    private Boolean canMove;
    private Image image;

    //Constructor
    public Alien(int x, int y,int aliensType,int aliensSpeed, int aliensDirection) {
        this.x=x;
        this.y=y;
        this.aliensType=aliensType;
        this.aliensSpeed= aliensSpeed;
        this.aliensDirection=aliensDirection;
        visible=true;
        canMove = true;
    }

     
   public void setImage(ImageIcon li){
      image=li.getImage();  
    }

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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public int getAliensType() {
        return aliensType;
    }
    public boolean isVisible() {
        return visible;
    }
    
    public Image getImage() {
        return image;
    }
    
    public Rectangle getBounds() {
        return new Rectangle(x, y, 40,20);
    }   

 //method to move aliehns
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

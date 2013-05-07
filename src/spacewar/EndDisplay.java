/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spacewar;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author Dhiraj
 */
public class EndDisplay {
    private int x;
    private int y;
    private boolean visible;
    private Image image;
   
    public EndDisplay(int x, int y){
       this.x=x;
        this.y=y;
        visible=false;
        
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
        return new Rectangle(x, y, 10,10);
    } 
   
}

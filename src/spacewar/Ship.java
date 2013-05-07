
package spacewar;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Ship {

    private int dx;
    private int dy;
    private int x;
    private int y;
    private int energyLevel;
    private int shipSpeed;    
    private Boolean visible;
    private Boolean canMove;
    private ArrayList bullets;
    private Image image;

    public Ship() {
        x=10;
        y=400;
        shipSpeed=4;
        visible=true;
        energyLevel=100;
        canMove = true;
        bullets = new ArrayList();
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

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel  = energyLevel;
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public int getEnergyLevel() {
        return energyLevel;
    }
    
    public Image getImage() {
        return image;
    }

    public ArrayList getBullets() {
        return bullets;
    }

    public boolean isVisible() {
        return visible;
    }
    public Rectangle getBounds() {
        return new Rectangle(x, y, 40,20);
    } 
    
    public void move() {
        if (canMove){
            if (x>1350){
                x=1350;
                dx=0;
            }
            if (x<0){
                x=0;
                dx=0;
            }
            if (y>700){
                y=700;
                dy=0;
            }
            if (y<0){
                y=0;
                dy=0;
            }
            x += dx;
            y += dy;
        }
     }

    public void fire() {
        if (energyLevel==100){
            bullets.add(new Bullet(x+this.image.getWidth(null) , y+this.image.getHeight(null)/2));
        }
    }
    
    
    public void keyPressed(KeyEvent e) {       

        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            fire();
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            dx = -shipSpeed;
        }

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            dx = shipSpeed;
        }

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            dy = -shipSpeed;
        }

        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            dy = shipSpeed;
        }

    }

    public void keyReleased(KeyEvent e) {      

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            dy = 0;
        }
        
         if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            System.exit(0);
        }
  
         
    }
}

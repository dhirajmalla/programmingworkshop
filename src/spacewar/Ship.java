
package spacewar;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Ship {

    private int dx;
    private int dy;
    private int x;
    private int y;
    private Boolean canMove;
    private ArrayList bullets;
    private Image image;

    public Ship() {
        x=10;
        y=400;
        canMove = true;
        bullets = new ArrayList();
    }

    public void setImage(ImageIcon li){
      image=li.getImage();  
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

    public ArrayList getBullets() {
        return bullets;
    }
    
    public void move() {
        if (canMove){
            if (x>1000){
                x=1000;
                dx=0;
            }
            if (x<0){
                x=0;
                dx=0;
            }
            if (y>600){
                y=600;
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
        bullets.add(new Bullet(x+this.image.getWidth(null) , y+this.image.getHeight(null)/2));
    }
    
    
    public void keyPressed(KeyEvent e) {       

        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            fire();
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            dx = -1;
        }

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            dx = 1;
        }

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            dy = -1;
        }

        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            dy = 1;
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
        
     

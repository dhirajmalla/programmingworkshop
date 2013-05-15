package spacewar;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.Timer;
 
/**
 * The controller class of the game
 * contains key control, game loop and draw
 * @author Team  Dhiraj  and Ioana
 * @version 1.0
 */
public class Fantasia extends JPanel implements ActionListener,World {

    private Timer timer;
    private Ship ship;
    private Mord location;
    private ArrayList aliens;
    private EndDisplay endDisplay;
    private GuiUtility graphicSetup;
    private Collision collision;
    private boolean isGame;
    private ArrayList bullets;
    String noOfAliensLeft;
    String noOfAliensKilled;
       
    // initial properties and positions  of aliens 
    Factory aliensFactory =new Factory();
    int[] aliensType=aliensFactory.aliensType();
    int[] aliensSpeed=aliensFactory.aliensSpeed();
    int[] aliensDirection=aliensFactory.aliensDirection();
    int[][] pos=aliensFactory.aliensPosition();
                
    
    public Fantasia() {       
        //adds keyboard listener to JPanel to receive key events for this component 
        addKeyListener(new TAdapter());
        setFocusable(true);      
        setInitialStage();

        timer = new Timer(10, this);
        timer.start();
    }
    

    private void setInitialStage(){
        location = new Mord();
        ship = new Ship();
        aliens = new ArrayList();
        graphicSetup=new GuiUtility();
        endDisplay=new EndDisplay(400,100);
        isGame=true;
        
        aliens.clear();
        for (int i =0;i<pos.length;i++){
            aliens.add(new Alien(pos[i][0],pos[i][1],aliensType[i],aliensSpeed[i],aliensDirection[i]));
        }
   }
    
    // drawing the game to the screen 
    @Override
    public void paint(Graphics g) {
            
         if (isGame){
            super.paint(g);

            Graphics2D g2d = (Graphics2D)g;
            
            graphicSetup.SetImage(location, ship, aliens, bullets,endDisplay);
            
            g2d.drawImage(location.getImage(), location.getX(), location.getY(), this);
            g2d.drawImage(location.getImage(), location.getXImage2(), location.getY(), this);
            
            g2d.drawImage(ship.getImage(), ship.getX(), ship.getY(), this);

            for (int i =0;i<aliens.size();i++){
                Alien alienss = (Alien)aliens.get(i);
                g2d.drawImage(alienss.getImage(), alienss.getX(), alienss.getY(), this);
            }

            bullets = ship.getBullets();
            for (int i = 0; i < bullets.size(); i++) {
                Bullet b = (Bullet)bullets.get(i);
                g2d.drawImage(b.getImage(), b.getX(), b.getY(), this);
            }

            Font font = new Font("Arial", Font.BOLD, 20);
            g.setFont(font);
            noOfAliensLeft=""+ aliens.size();
            noOfAliensKilled=""+(30-aliens.size());
            
            g.drawString("Aliens Left: " + noOfAliensLeft, 25, 25);
            g.drawString("Aliens Killed: " + noOfAliensKilled, 600, 25);
       
            
            if (endDisplay.isVisible()){
                g2d.drawImage(endDisplay.getImage(), endDisplay.getX(), endDisplay.getY(), this);
            }
            
        }
    }
// calling the method move from class ship to move the craft 
    @Override
    public void actionPerformed(ActionEvent e) {
        location.move();
        ship.move();

        bullets = ship.getBullets();
        for (int i = 0; i < bullets.size(); i++) {
            Bullet b = (Bullet)bullets.get(i);
            b.move();
        }

        for (int i =0;i<aliens.size();i++){
            Alien alienss = (Alien)aliens.get(i);
            alienss.move();
        }  
            
        //checkCollisions();
        collision=new Collision();
        collision.checkCollisionBulletAlien(ship, bullets, aliens);
        collision.checkCollisionShipAlien(ship, aliens,location,endDisplay);
        //
        
        repaint();  
    }

 
    /**
     * inner class implemented  to handle keyboard input from the user . 
     * handles dynamic input during game play 
     */
    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            if (e.getKeyCode()==KeyEvent.VK_ENTER){
                    setInitialStage();
            }else{
                ship.keyReleased(e);
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {
                ship.keyPressed(e);
        }
    }
}

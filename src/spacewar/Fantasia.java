package spacewar;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
 
/**
 * creates JPanel on which we draw the game and listeners for keyboard events 
 */
public class Fantasia extends JPanel implements ActionListener {

    private Timer timer;
    private Ship ship;
    private North location;
    private ArrayList aliens;
    private EndDisplay endDisplay;
    private boolean isGame;
    String noOfAliensLeft;
    String noOfAliensKilled;
       
       // initial properties and positions  of aliens 
    int[] aliensType = {
                                1,1,1, 1,1,1,1,1,1,1,
                                2,2,2,2,2,2,2,2,2,2,
                                3,3,3,3,3,3,3,3,3,3,
                                    }; 
    int[] aliensSpeed = {
                                2,2,2,2,2,2,2,2,2,2,
                                3,3,3,3,3,3,3,3,3,3,
                                4,4,4,4,4,4,4,4,4,4
                                    }; 
    int[] aliensDirection = {
                                0,0,0,0,0,0,0,0,0,0,
                                0,0,0,0,0,0,0,0,0,0,
                                1,1,1,1,1,1,1,1,1,1
                                        }; 

    private int[][] pos = { 
        {1000, 35}, {1000,105}, {1000, 175}, {1000, 245}, {1000, 315}, {1000, 385}, {1000, 455}, {1000, 525}, {1000, 595}, {1000, 665},
        {4000, 35}, {4050,105}, {4100, 175}, {4150, 245}, {4200, 315}, {4150, 385}, {4100, 455}, {4050, 525}, {4000, 595}, {4950, 665},
        {8000, 10}, {8050,80}, {8100, 150}, {8150, 220}, {8200, 290}, {8150, 360}, {8100, 430}, {8500, 500}, {8000, 570}, {8000, 640}
       };
    
    
    public Fantasia() {
        
        //adds keyboard listener to JPanel to receive key events for this component 
        addKeyListener(new TAdapter());
        setFocusable(true);      

        setInitialStage();
        timer = new Timer(10, this);
        timer.start();
    }

// drawing the game to the screen 
    @Override
    public void paint(Graphics g) {
            
         if (isGame){
            super.paint(g);

            Graphics2D g2d = (Graphics2D)g;

            ImageIcon iiLocation = new ImageIcon(this.getClass().getResource("\\picture\\bggame.jpg"));
            location.setImage(iiLocation);
            g2d.drawImage(location.getImage(), location.getX(), location.getY(), this);
            g2d.drawImage(location.getImage(), location.getXImage2(), location.getY(), this);
            
            g2d.drawImage(ship.getImage(), ship.getX(), ship.getY(), this);
            if (ship.getEnergyLevel()==0){
                ImageIcon iiShipBlast = new ImageIcon(this.getClass().getResource("\\picture\\explosion.png"));
                ship.setImage(iiShipBlast);
            }else{
                ImageIcon iiShip = new ImageIcon(this.getClass().getResource("\\picture\\craft.png"));
                ship.setImage(iiShip);
            }

               
            ImageIcon iiAlien1 = new ImageIcon(this.getClass().getResource("\\picture\\alien1.png"));
            ImageIcon iiAlien2 = new ImageIcon(this.getClass().getResource("\\picture\\alien2.png"));
            ImageIcon iiAlien3 = new ImageIcon(this.getClass().getResource("\\picture\\alien3.png"));
            ImageIcon iiAlien4 = new ImageIcon(this.getClass().getResource("\\picture\\alien4.png"));

            for (int i =0;i<aliens.size();i++){
                Alien alienss = (Alien)aliens.get(i);
                g2d.drawImage(alienss.getImage(), alienss.getX(), alienss.getY(), this);
                if (alienss.getAliensType()==1){
                    alienss.setImage(iiAlien1);
                }
                if (alienss.getAliensType()==2){
                    alienss.setImage(iiAlien2);
                }
                if (alienss.getAliensType()==3){
                    alienss.setImage(iiAlien3);
                }
                if (alienss.getAliensType()==4){
                    alienss.setImage(iiAlien4);
                }
            }

            Font font = new Font("Arial", Font.BOLD, 20);
            g.setFont(font);
            noOfAliensLeft=""+ aliens.size();
            noOfAliensKilled=""+(30-aliens.size());
            
            g.drawString("Aliens Left: " + noOfAliensLeft, 25, 25);
            g.drawString("Aliens Killed: " + noOfAliensKilled, 600, 25);
            
            
            ImageIcon iiBullet = new ImageIcon(this.getClass().getResource("\\picture\\bullet.png"));
            ArrayList bullets = ship.getBullets();
            for (int i = 0; i < bullets.size(); i++) {
                Bullet b = (Bullet)bullets.get(i);
                g2d.drawImage(b.getImage(), b.getX(), b.getY(), this);
                b.setImage(iiBullet);
            }

            if (endDisplay.isVisible()){
                g2d.drawImage(endDisplay.getImage(), endDisplay.getX(), endDisplay.getY(), this);
               ImageIcon iiStartGame = new ImageIcon(this.getClass().getResource("\\picture\\enddisplay.jpg"));
                endDisplay.setImage(iiStartGame);
            }
            
        }
    }
// calling the method move from class ship to move the craft 
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        ArrayList bullets = ship.getBullets();
        for (int i = 0; i < bullets.size(); i++) {
            Bullet b = (Bullet)bullets.get(i);
            if (b.isVisible()){ 
                b.move();
                Sound.SHOOT.play(); 
            }else {
                bullets.remove(i);
            }
        }

        for (int i =0;i<aliens.size();i++){
            Alien alienss = (Alien)aliens.get(i);
            if (alienss.isVisible()){
                alienss.move();
            }else{
                aliens.remove(i);
            }
        }  
            
        location.move();
        checkCollisions();
        ship.move();
        repaint();  
    }

    public void checkCollisions() {

        Rectangle shipRectangle = ship.getBounds();

        for (int j = 0; j<aliens.size(); j++) {
            Alien a = (Alien) aliens.get(j);
            Rectangle aliensRectangle = a.getBounds();

            if (shipRectangle.intersects(aliensRectangle)) {
                aliens.remove(j);
                ship.setEnergyLevel(0);
                ship.setCanMove(false);
                endDisplay.setVisible(true);
                
                for (int k = 0; k<aliens.size(); k++) {
                    Alien ak = (Alien) aliens.get(k);
                    ak.setCanMove(false);
                    Sound.BOOM.play();
                }

            }
        }

        ArrayList bullets = ship.getBullets();
        for (int i = 0; i < bullets.size(); i++) {
            Bullet m = (Bullet) bullets.get(i);

            Rectangle bulletRectangle = m.getBounds();

            for (int j = 0; j<aliens.size(); j++) {
                Alien a = (Alien) aliens.get(j);
                Rectangle aliensRectangle = a.getBounds();

                if (bulletRectangle.intersects(aliensRectangle)) {
                    m.setVisible(false);
                    a.setVisible(false);
                }
            }
        }
    }

    private void setInitialStage(){
        location = new North();
        ship = new Ship();
        aliens = new ArrayList();
        endDisplay=new EndDisplay(400,100);
        isGame=true;
        endDisplay.setVisible(false);
        ship.setEnergyLevel(100);
        ship.setCanMove(true);
        
        aliens.clear();
        for (int i =0;i<pos.length;i++){
            aliens.add(new Alien(pos[i][0],pos[i][1],aliensType[i],aliensSpeed[i],aliensDirection[i]));
        }
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
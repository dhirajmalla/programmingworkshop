package spacewar;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
 
/**
 * 
 * creates JPanel on which we draw the game and listeners for keyboard events 
 */
public class Fantasia extends JPanel implements ActionListener {

    private Timer timer;
    private Ship ship;
    private North location;
    private Alien[] aliens=new Alien[5];
    private Bullet bullet;
    
    // initial positions of aliens ship
    private int[][] pos = { 
        {2380, 29}, {2500, 159}, {1380, 89},{1000,500},{400,300}
       };

    public Fantasia() {
        
        //adds keyboard listener to JPanel to receive key events for this component 
        addKeyListener(new TAdapter());
        setFocusable(true);      

        //location = new South();
        location = new North();
        ship = new Ship();
        //bullet= new Bullet();
        
        for (int i =0;i<aliens.length;i++){
            aliens[i] = new Alien();
            aliens[i].setX(pos[i][0]);
            aliens[i].setY(pos[i][1]);
        }
        

        timer = new Timer(5, this);
        timer.start();
    }

// drawing the game to the screen 
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D)g;
        
        g2d.drawImage(location.getImage(), location.getX(), location.getY(), this);
        ImageIcon iiLocation = new ImageIcon(this.getClass().getResource("\\picture\\north1.jpg"));
        location.setImage(iiLocation);
        
        
        g2d.drawImage(ship.getImage(), ship.getX(), ship.getY(), this);
        ImageIcon iiShip = new ImageIcon(this.getClass().getResource("\\picture\\craft.png"));
        ship.setImage(iiShip);
        
        ImageIcon iiAlien = new ImageIcon(this.getClass().getResource("\\picture\\alien.png"));

        for (int i =0;i<aliens.length;i++){
            g2d.drawImage(aliens[i].getImage(), aliens[i].getX(), aliens[i].getY(), this);
            aliens[i].setImage(iiAlien);
        }
        
        ImageIcon iiBullet = new ImageIcon(this.getClass().getResource("\\picture\\bullet.png"));
        ArrayList bullets = ship.getBullets();
        for (int i = 0; i < bullets.size(); i++) {
            Bullet b = (Bullet)bullets.get(i);
            g2d.drawImage(b.getImage(), b.getX(), b.getY(), this);
            b.setImage(iiBullet);
        }

        //g2d.drawImage(bullet.getImage(), bullet.getX(), bullet.getY(), this);
       
    }

// calling the method move from class ship to move the craft 
    @Override
    public void actionPerformed(ActionEvent e) {
        ship.move();
        
        ArrayList bullets = ship.getBullets();
        for (int i = 0; i < bullets.size(); i++) {
            Bullet b = (Bullet)bullets.get(i);
            b.move();
        }

        for (int i =0;i<aliens.length;i++){
            aliens[i].move();
        }
        
        repaint();  
    }


    /**
     * inner class implemented  to handle keyboard input from the user . 
     * handles dynamic input during game play 
     */
    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            ship.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            ship.keyPressed(e);
        }
    }

}

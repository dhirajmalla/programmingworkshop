package spacewar;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.Timer;
 
/**
 * 
 * creates JPanel on which we draw the game and listeners for keyboard events 
 */
public class Fantasia extends JPanel implements ActionListener {

    private Timer timer;
    private Ship craft;
    private North location;
    private Alien[] aliens=new Alien[5];
   
    private Bullet bullet;

    public Fantasia() {
        
        //adds keyboard listener to JPanel to receive key events for this component 
        addKeyListener(new TAdapter());
        setFocusable(true);      

        //location = new South();
        location = new North();
        craft = new Ship();
        
        for (int i =0;i<aliens.length;i++){
            aliens[i] = new Alien();
        }
        
        bullet= new Bullet();

        timer = new Timer(1, this);
        timer.start();
    }

// drawing the game to the screen 
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D)g;
        g2d.drawImage(location.getImage(), location.getX(), location.getY(), this);
        g2d.drawImage(craft.getImage(), craft.getX(), craft.getY(), this);
        
        for (int i =0;i<aliens.length;i++){
            g2d.drawImage(aliens[i].getImage(), aliens[i].getX(), aliens[i].getY(), this);
            aliens[i].setX(i*70);
            aliens[i].setY(i*70);
            
        }
        
        
        g2d.drawImage(bullet.getImage(), bullet.getX(), bullet.getY(), this);
     
       
    }

// calling the method move from class ship to move the craft 
    @Override
    public void actionPerformed(ActionEvent e) {
        craft.move();
        repaint();  
    }


    /**
     * inner class implemented  to handle keyboard input from the user . 
     * handles dynamic input during game play 
     */
    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            craft.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            craft.keyPressed(e);
        }
        
      
    }

}

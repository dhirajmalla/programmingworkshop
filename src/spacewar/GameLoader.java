package spacewar;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Team  Dhiraj  and Ioana
 * @version 1.0
 */

public class GameLoader extends JFrame {

    public GameLoader(){
        // creates the instance of Fantasy.java
        add(new Fantasia());
       
       
        setTitle("Fantasia");           
        setLocationRelativeTo(null);       
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        // sets the frame to full screen 
        setExtendedState(MAXIMIZED_BOTH);
    }
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Fantasia");
        frame.setVisible(true);
        frame.setSize(500,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(MAXIMIZED_BOTH);
        
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);
        
        
        JButton button = new JButton("Start Game");
        panel.add(button);
        button.setBounds(630, 230, 100, 30);
        button.addActionListener (new Action());
        

    JLabel mainTitle = new JLabel("FANTASIA");
        mainTitle.setFont(new Font("Arial",20 , 38));
        mainTitle.setBounds(600,30, 415, 230);
        panel.setSize(250, 250);
        panel.add(mainTitle);
        
        JLabel menu = new JLabel("Kill all the aliens and free Fantasia. \n Controls:\nArrows Keys - Move. \n Space Key - Fire."
                + "\n Esc Key to exit game");
        menu.setFont(new Font("Arial",2 , 14));
        menu.setBounds(400,300, 1000, 130);
        panel.add(menu);      
    }
    
    
    static class Action implements ActionListener {        
        @Override
        public void actionPerformed (ActionEvent e) {
             GameLoader gameLoader=new GameLoader();
             Sound.BG.loop();
        }
    }

}

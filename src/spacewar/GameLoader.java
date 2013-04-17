package spacewar;

import javax.swing.JFrame;

/**
 * 
 * creates frame for game and sets its properties 
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
        GameLoader gameLoader=new GameLoader();
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spacewar;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Dhiraj
 */
public class North {
    

    private int x;
    private int y;
    private Image image;

    public North() {
        ImageIcon ii = new ImageIcon(this.getClass().getResource("\\picture\\north1.jpg"));
        image = ii.getImage();
        x = 0;
        y = 0;
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

       
}

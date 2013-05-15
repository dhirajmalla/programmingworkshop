
package spacewar;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 * This class set the image to the different objects
 * @author Team  Dhiraj  and Ioana
 * @version 1.0
 */
public class GuiUtility {

    public GuiUtility(){
    }
    
    public void SetImage(Mord location, Ship ship, ArrayList aliens, ArrayList bullets, EndDisplay endDisplay){
            ImageIcon iiLocation = new ImageIcon(this.getClass().getResource("\\picture\\bggame.jpg"));
            location.setImage(iiLocation);

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

            ImageIcon iiBullet = new ImageIcon(this.getClass().getResource("\\picture\\bullet.png"));
            bullets = ship.getBullets();
            for (int i = 0; i < bullets.size(); i++) {
                Bullet b = (Bullet)bullets.get(i);
                b.setImage(iiBullet);
            }

        ImageIcon iiStartGame = new ImageIcon(this.getClass().getResource("\\picture\\enddisplay.jpg"));
        endDisplay.setImage(iiStartGame);

    }
    
}

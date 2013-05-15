
package spacewar;

/**
 * The class to contains aliens properties
 * @author Team  Dhiraj  and Ioana
 * @version 1.0
 */
public class Factory {

    private int[] aliensType = {
                                1,1,1, 1,1,1,1,1,1,1,
                                2,2,2,2,2,2,2,2,2,2,
                                3,3,3,3,3,3,3,3,3,3,
                                    }; 
   private int[] aliensSpeed = {
                                2,2,2,2,2,2,2,2,2,2,
                                3,3,3,3,3,3,3,3,3,3,
                                4,4,4,4,4,4,4,4,4,4
                                    }; 
   private  int[] aliensDirection = {
                                0,0,0,0,0,0,0,0,0,0,
                                0,0,0,0,0,0,0,0,0,0,
                                1,1,1,1,1,1,1,1,1,1
                                        }; 

    private int[][] pos = { 
        {1000, 35}, {1000,105}, {1000, 175}, {1000, 245}, {1000, 315}, {1000, 385}, {1000, 455}, {1000, 525}, {1000, 595}, {1000, 665},
        {4000, 35}, {4050,105}, {4100, 175}, {4150, 245}, {4200, 315}, {4150, 385}, {4100, 455}, {4050, 525}, {4000, 595}, {4950, 665},
        {8000, 10}, {8050,80}, {8100, 150}, {8150, 220}, {8200, 290}, {8150, 360}, {8100, 430}, {8500, 500}, {8000, 570}, {8000, 640}
       };
 
    public  int[] aliensType(){
        return aliensType;
    }
    
    public  int[] aliensSpeed(){
        return aliensSpeed;
    }
    public  int[] aliensDirection(){
        return aliensDirection;
    }
        
    public  int[][] aliensPosition(){
        return pos;
    }
}

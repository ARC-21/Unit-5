// name:      date: 
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class KarelExample
{
   public static void main(String[] args)
   {
      Display.openWorld("maps/first.map");
      Display.setSize(10,10);
      Display.setSpeed(2);
      Robot karel = new Robot(2,1,1,0);
      
      karel.move();
      karel.pickBeeper();
      karel.move();
      karel.turnLeft();
      karel.move();
      karel.putBeeper();
      karel.move();
      karel.turnLeft();
      karel.turnLeft();
   }
}


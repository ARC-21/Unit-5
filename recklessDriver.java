import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class recklessDriver extends Athlete implements Driver
{
   public recklessDriver()
   {
      super(2,2,Display.EAST, Display.INFINITY);
   }
   public void drive()
   {
         move();
         turnLeft();
         move();
         turnRight();
         move();
         turnRight();
         move();
         turnLeft();
   }
}
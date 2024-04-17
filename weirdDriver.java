import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class weirdDriver extends Athlete implements Driver
{
   public weirdDriver()
   {
      super(2, 6, Display.EAST, Display.INFINITY);
   }
   public void drive()
   {
         move();
         turnLeft();
         move();
         turnLeft();
         move();
         turnLeft();
         move();
         turnLeft();
         sprint(2);
   }
}
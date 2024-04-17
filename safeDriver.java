import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class safeDriver extends Athlete implements Driver
{
   public safeDriver()
   {
      super(2, 4, Display.EAST, Display.INFINITY);
   }
   public void drive()
   {
      sprint(2);
   }
}
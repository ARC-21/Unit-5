import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class driverDriver
{
   public static void main(String[] args)
   {
      Display.openWorld("maps/road");
      Display.setSpeed(8);
      Driver a = new recklessDriver();
      Driver b = new safeDriver();
      Driver c = new weirdDriver();
      driver(a);
      driver(b);
      driver(c);
   }
   public static void driver(Driver x)
   {
      for (int i = 0; i < 4; i++) {
         x.drive();
      }
   }
}
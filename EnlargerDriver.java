import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class EnlargerDriver
{
   public static void main(String[] args)
   {
      Display.openWorld("maps/B2.map");
      Display.setSize(10, 10);
      Display.setSpeed(10);
      Enlarger e = new Enlarger(2);
      e.enlarge(0);
   }
}
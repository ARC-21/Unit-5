import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class RetrieverDriver
{
   public static void main(String[] args)
   {
      Display.openWorld("maps/retrieve1.map");
      Display.setSize(10, 10);
      Display.setSpeed(8);
      RecursiveRetriever r1 = new RecursiveRetriever();
      r1.retrieve();
   }
}
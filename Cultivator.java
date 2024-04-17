import edu.fcps.karel2.Display;

public class Cultivator extends Athlete implements Farmer
{
   public Cultivator()
   {
      super(2, 2, Display.EAST, Display.INFINITY);
   }
   public void workOnePlant()
   {
      if(nextToABeeper())
      {
         pickBeeper();
      }
      else
      {
         putBeeper();
      }
   }
}
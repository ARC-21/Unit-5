import edu.fcps.karel2.Display;

public class Planter extends Athlete implements Farmer
{
   public Planter()
   {
      super(2, 2, Display.EAST, Display.INFINITY);
   }
   public void workOnePlant()
   {
      if(!nextToABeeper())
      {
         putBeeper();
      }
   }
   
}
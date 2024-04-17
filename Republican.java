import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class Republican extends Athlete implements Escapable
{
   public Republican()
   {
      super(1, 1, Display.NORTH, 0);
   }
   public void escape()
   {
      if (rightIsClear())
      {
         turnRight();
         while (frontIsClear())
         {
            move();
         }
         turnRight();
      }
      while (!nextToABeeper())
      {
         while (frontIsClear() && !nextToABeeper())
         {
            move();
            if (rightIsClear())
            {
               turnRight();
            }
         }
         turnLeft();
      }
      //System.out.println("Beeper!");
   }
}
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class MazeEscaper extends Athlete implements Escapable
{
   public MazeEscaper()
   {
      super(1, 1, Display.NORTH, 0);
   }
   public void escape()
   {
      while (!nextToABeeper())
      {
         while (frontIsClear() && !nextToABeeper())
         {
            move();
            if (leftIsClear())
            {
               turnLeft();
            }
         }
         turnRight();
      }
      //System.out.println("Beeper!");
   }
}
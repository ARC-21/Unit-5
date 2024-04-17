import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public abstract class ObstacleBot extends Athlete implements Runnable
{
   public ObstacleBot(int x)
   {
      super(x, 1, Display.NORTH, 0);
   }
   public abstract boolean keepGoing();
   public void run()
   {
      int s = 0;
      while (keepGoing())
      {
         if (frontIsClear())
         {
            move();
         }
         else
         {
            turnRight();
            while (!leftIsClear())
            {
               move();
               s++;
            }
            turnLeft();
            move();
            turnLeft();
            sprint(s);
            turnRight();
            s = 0;
         }
      }
   }
}
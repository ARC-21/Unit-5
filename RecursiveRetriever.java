import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class RecursiveRetriever extends Athlete
{
   private int y = 1;
   private int x = 1;
   public RecursiveRetriever()
   {
      super(1, 1, Display.NORTH, 0);
   }
   public String retrieve()
   {
      move();
      if (getDirection() == Display.NORTH)
      {
         y++;
      }
      else
      {
         y--;
      }
      if (nextToABeeper())
      {
         pickPile();
      }
      if (y == 1 && x == 2)
      {
         turnLeft();
         turnLeft();
         return retrieve();
      }
      else if (x == 2 && leftIsClear() && getDirection() != Display.SOUTH)
      {
         turnLeft();
         move();
         turnLeft();
         x--;
         return retrieve();
      }
      else if (x == 1 && rightIsClear() && getDirection() == Display.NORTH)
      {
         turnRight();
         move();
         turnRight();
         x++;
         return retrieve();
      }
      else if (x == 1 && y == 1)
      {
         putPile(getBeepers());
         turnLeft();
         turnLeft();
         move();
         return null;
      }
      else
      {
         return retrieve();
      }
   }
}
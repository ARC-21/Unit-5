import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class PileShifter extends Athlete implements Shiftable
{
   public PileShifter(int x, int y)
   {
      super(x, y, Display.WEST, 0);
   }
   public void shift()
   {
      while (frontIsClear())
      {
         moveToPile();
         shiftPile();
      }
   }
   public void shiftPile()
   {
      int b = pickAndCountPile();
      moveBackOneSpace();
      putPile(b);
      move();
   }
   public void moveToPile()
   {
      while(!nextToABeeper() && frontIsClear())
      {
         move();
      }  
   }
   public void moveBackOneSpace()
   {
      turnLeft();
      turnLeft();
      move();
      turnLeft();
      turnLeft();
   }
   public int pickAndCountPile()
   {
      int sum = 0;
      while (nextToABeeper())
      {
         sum++;
         pickBeeper();
      }
      return sum;
   }
   public void putPile(int b)
   {
      for (int i = 0; i < b; i++)
      {
         putBeeper();
      }
   }
}
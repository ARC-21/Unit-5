import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class TreasureHunter extends Athlete implements MapReadable
{
   public TreasureHunter()
   {
      super(1, 1, Display.EAST, 0);
   }
   public void findTreasure()
   {
      int b = 0;
      while (b != 5)
      {
         while(!nextToABeeper())
         { 
            move();
         }
         b = countBeepers();
         if (b == 1)
         {
            turnLeft();
            move();
         }
         else if (b == 2)
         {
            turnLeft();
            turnLeft();
            move();
         }
         else if (b == 3)
         {
            turnRight();
            move();
         }
         else if (b == 5)
         {
            break;
         }         
         else
         {
            move();
         }
      }
   }
   public int countBeepers()
   {
      int b = 0;
      while (nextToABeeper())
      {
         pickBeeper();
         b++;
      }
      return b;
   }
}
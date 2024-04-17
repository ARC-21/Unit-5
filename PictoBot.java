import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class PictoBot extends Athlete implements Rotatable
{
   public PictoBot()
   {
      super(1, 1, Display.EAST, 0);
   }
   public void rotate()
   {
      int columns = 4;
      int b = 0;
      int[] lines = new int[columns];
      turnLeft();
      for (int i = 0; i < columns; i++)
      {
         while (nextToABeeper())
         {
            pickBeeper();
            b++;
            //System.out.println("incremented b!");
            move();
         }
         //System.out.println("b is !" + b + " and i is " + i);
         turnLeft();
         turnLeft();
         sprint(b);
         turnLeft();
         move();
         turnLeft();
         lines[i] = b;
         b = 0;
      }
      turnLeft();
      sprint(4);
      turnLeft();
      turnLeft();
      for (int i = lines.length-1; i >= 0; i--)
      {
         for (int j = 0; j < lines[i]; j++)
         {
            putBeeper();
            move();
         }
         turnLeft();
         turnLeft();
         sprint(lines[i]);
         turnRight();
         move();
         turnRight();
      }
   }
}
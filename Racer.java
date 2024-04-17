import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Racer extends Athlete
{
   public Racer(int x)
   {
      super(1, x, Display.EAST, 0);
   }
   public void shuttle(int spaces, int beepers)
   {
      move();
      turnLeft();
      move();
      turnRight();
      move();
      turnRight();
      move();
      turnLeft();
      sprint(spaces);
      for (int i = 0; i < beepers; i++)
      {
         pickBeeper();
      }
      turnLeft();
      turnLeft();
      sprint(spaces);
      turnRight();
      move();
      turnLeft();
      move();
      turnLeft();
      move();
      turnRight();
      move();
      for (int i = 0; i < beepers; i++)
      {
         putBeeper();
      }
      turnLeft();
      turnLeft();
   }
}
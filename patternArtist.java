import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class patternArtist extends Athlete
{
   private int[] x;
   private int[] y;
   private int[] b;
   public patternArtist()
   {
      super(1,4,Display.SOUTH, 0);
   }
   public void findColumns()
   {
      move();
      turnLeft();
      int steps = 0;
      while (nextToABeeper())
      {
         steps++;
         move();
      }
      x = new int[steps];
      y = new int[steps];
      b = new int[steps];
      turnLeft();
      turnLeft();
      sprint(steps);
      turnAround();
   }
   public int[] findX(int[] z)
   {
      int bp = 0;
      for (int i = 0; i < z.length; i++)
      {
         while (nextToABeeper())
         {
            pickBeeper();
            bp++;
         }
         z[i] = bp;
         System.out.println(bp);
         bp = 0;
         move();
      }
      System.out.println("_______________");
      return z;
   }
   public void copyPattern()
   {
      findColumns();
      x = findX(x);
      returnToSpot();
      turnLeft();
      move();
      turnRight();
      y = findX(y);
      returnToSpot();
      turnDirection(Display.EAST);
      b = findX(b);
      returnToSpot();
      turnDirection(Display.EAST);
      for (int i = 0; i < x.length; i++)
      {
         sprint(x[i]-1);
         turnDirection(Display.NORTH);
         sprint(y[i]-1);
         putPile(b[i]);
         returnToSpot();
      }
   }
   public void returnToSpot()
   {
      turnDirection(Display.SOUTH);
      while (frontIsClear())
      {
         move();
      }
      turnDirection(Display.WEST);
      while (frontIsClear())
      {
         move();
      }
      turnAround();
   }
   public void turnDirection(int dir)
   {
      while (getDirection() != dir)
      {
         turnLeft();
      }
   }
}
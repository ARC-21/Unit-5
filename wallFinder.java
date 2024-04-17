import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class wallFinder extends Athlete
{
   public static void main(String[] args)
   {
      Display.openWorld("maps/C2.map");
      Display.setSize(10, 10);
      Display.setSpeed(10);
      Athlete[] bots = new Athlete[64];
      int h = 0;
      int v = 0;
      for (int x = 1; x <= 8; x++)
      {
         for (int y = 1; y <= 8; y++)
         {
            bots[x*y-1] = new Athlete(x, y, Display.NORTH, Display.INFINITY);
            if (!bots[x*y-1].frontIsClear())
               v++;
            if (!bots[x*y-1].rightIsClear())
               h++;
         }
      }
      Athlete recordKeeper = new Athlete(1,9, Display.EAST, Display.INFINITY);
      recordKeeper.putPile(v);
      recordKeeper.move();
      recordKeeper.putPile(h);
      recordKeeper.move();
   }
}
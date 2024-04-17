import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class BetterThreadRacer extends Racer implements Runnable
{
   int[] distances;
   int[] pileSizes;
   public BetterThreadRacer(int y, int[] ds, int[] pSs)
   {
      super(y);
      distances = ds;
      pileSizes = pSs;
   }
   public void run()
   {
      for (int i = 0; i < distances.length; i++)
      {
         shuttle(distances[i], pileSizes[i]);
      }
      move();
   }
}
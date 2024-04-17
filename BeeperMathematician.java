import edu.fcps.karel2.Display;
public class BeeperMathematician extends Athlete
{
   public BeeperMathematician(int y)
   {
      super(1,y,Display.EAST,Display.INFINITY);
   }
   public int getPileSize()
   {
      int count = 0;
      while (nextToABeeper())
      {
         pickBeeper();
         count++;
      }
      this.putPile(count);
      return count;
   }
   public boolean isOddPile()
   {
      int count = getPileSize();
      if (count % 2 == 0)
      {
         return false;
      }
      else
      {
         return true;
      }
   }
   public boolean[] oddsAndEvensInRow(int piles)
   {
      int pileSize;
      boolean[] array = new boolean[piles];
      for (int i = 0; i < piles; i++)
      {
         if (isOddPile())
         {
            array[i] = true;
         }
         else
         {
            array[i] = false;
         }
         this.move();
      }
      return array;
   }
   public double getAverageOfPiles(int p)
   {
      double sum = 0;
      for (int i = 0; i < p; i++)
      {
         sum += getPileSize();
         move();
      }
      return sum/p;
   }
   public int[] getPileSizes(int p)
   {
      int[] array = new int[p];;
      for (int i = 0; i < p; i++)
      {
         array[i] = getPileSize();
         move();
      }
      return array;
   }
   public void placePiles(int[] piles)
   {
      for (int i = 0; i < piles.length; i++)
      {
         putPile(piles[i]);
         move();
      }
   }

}
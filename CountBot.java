public class CountBot extends ObstacleBot
{
   int row;
   int s = 0;
   public CountBot(int x, int y)
   {
      super(x);
      row = y;
   }
   public boolean keepGoing()
   {
      s++;
      if (s == row)
      {
         return false;
      }
      return true;
   }
}
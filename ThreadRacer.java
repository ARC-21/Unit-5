import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class ThreadRacer extends Racer implements Runnable
{
   public ThreadRacer(int y)
   {
      super(y);
   }
   public void run()
   {
      shuttle(2, 7);
      shuttle(4, 5);
      shuttle(6, 3);
      move();
   }
   
}
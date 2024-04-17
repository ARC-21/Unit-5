import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class StackFixerDemo
{
   public static void main(String[] args)
   {
      Display.openWorld("maps/randomStacks.map");
      Display.setSize(10,10);
      Display.setSpeed(10);
      StackFixer[] bots = new StackFixer[10];
      for (int i = 1; i <= 10; i++)
      {
         bots[i-1] = new StackFixer(1, i, i, 10);
      }
      for (int i = 0; i < 10; i++)
      {
         bots[i].fixStacks();
      }
   }
}
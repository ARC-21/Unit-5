import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class StackFixer extends Robot implements Fixable
{
   int size;
   int steps;
   
   public StackFixer(int x, int y, int sz, int st)
   {
      super(x, y, Display.EAST, Display.INFINITY);
      size = sz;
      steps = st;
   }
   public void fixStack()
   {
      while (nextToABeeper())
      {
         pickBeeper();
      }
      for (int i = 0; i < size; i++)
      {
         putBeeper();
      }
   }
   public void fixStacks()
   {
      for (int i = 0; i < steps; i++)
      {
         if (nextToABeeper())
         {
            fixStack();
         }
         move();
      }
   }
}
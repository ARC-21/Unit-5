import edu.fcps.karel2.Display;

public class BeeperCascade extends Athlete
{
   public BeeperCascade()
   {
      super(5,5,Display.EAST,Display.INFINITY);
   }
   public BeeperCascade(int x, int y, int dir, int beepers)
   {
      super(x,y,dir,beepers);
   }
   public BeeperCascade(int beepers)
   {
      super(5,5,Display.EAST,beepers);
   }
   public void cascade(int n)
   {
      int steps = 0;
      for (int i = n; i > 1; i--)
      {
         this.putPile(i);
         this.move();
         steps++;
      }
      this.putPile(1);
      this.turnLeft();
      this.turnLeft();
      this.sprint(steps);
   }
}
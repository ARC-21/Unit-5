import edu.fcps.karel2.Display;

public class BeeperDiamond extends BeeperCascade
{
   public BeeperDiamond()
   {
      super(85);
   }

   public void makeDiamond()
   {
      this.turnLeft();
      this.turnLeft();
      for (int i = 5; i > 0; i-= 1)
      {
         this.cascade(i);
         this.turnLeft();
         this.move();
         this.turnLeft();
      }
      this.turnLeft();
      this.sprint(6);
      this.turnRight();
      for (int i = 4; i > 1; i-=1)
      {
         this.cascade(i);
         this.turnRight();
         this.move();
         this.turnRight();
      }
      this.putBeeper();
      this.turnRight();
      this.sprint(4);
      this.turnRight();
      this.move();
      for (int i = 4; i > 0; i-=1)
      {
         this.cascade(i);
         this.turnRight();
         this.move();
         this.turnRight();
      }
      this.turnRight();
      this.sprint(5);
      this.turnLeft();
      for (int i = 3; i > 0; i-=1)
      {
         this.cascade(i);
         this.turnLeft();
         this.move();
         this.turnLeft();
      }
   }  
}
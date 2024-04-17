import edu.fcps.karel2.Display;

public class BeeperDiamondDriver
{
   public static void main(String[] args)
   {
      BeeperDiamond bot = new BeeperDiamond();
      Display.setSpeed(10);
      bot.makeDiamond();
   }
}
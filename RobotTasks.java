import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class RobotTasks
{  
   public static void main(String[] args) {
      String filename = JOptionPane.showInputDialog("What robot world?");
      Display.openWorld("maps/" + filename + ".map");
      Display.setSize(12, 12);
      Display.setSpeed(0);
      
      int steps = 0;
      Robot one = new Robot();
      while (one.nextToABeeper())
      {
         one.move();
      }
      Robot two = new Robot(1,2,0,0);
      while (!two.nextToABeeper())
      {
         two.move();
      }
      Robot three = new Robot(1,3,0,0);
      while (three.frontIsClear())
      {
         three.move();
      }
      Robot four = new Robot(1,4,0,0);
      int beepers = 0;
      while (four.frontIsClear())
      {
         if (four.nextToABeeper())
         {
            four.pickBeeper();
            beepers++;
         }
         four.move();
      }
      if (four.nextToABeeper())
      {
         four.pickBeeper();
         beepers++;
      }
      System.out.println("Robot 4 has " + beepers + " beepers");
      Robot five = new Robot(1,5,0,0);
      while (five.frontIsClear())
      {
         while (five.nextToABeeper())
         {
            five.pickBeeper();
         }
         five.move();
      }
      while (five.nextToABeeper())
      {
         five.pickBeeper();
      }
      Robot six = new Robot(1,6,0,0);
      int beeperFronts = 0;
      if (!six.nextToABeeper())
      {
         beeperFronts++;
      }
      while (beeperFronts != 2)
      {
         six.move();
         if (!six.nextToABeeper())
         {
            beeperFronts++;
         }
      }
      boolean obstacle = false;
      Robot seven = new Robot(1,7,0,0);
      steps = 0;
      while (!seven.nextToABeeper() && seven.frontIsClear())
      {
         seven.move();
         steps++;
      }
      System.out.println("seven took " + steps + " steps");
      Robot eight = new Robot(1,8,0,0);
      steps = 3;
      if (eight.nextToABeeper())
      {
         steps = 5;
      }
      for (int i = 0; i < steps; i++)
      {
         eight.move();
      }
      Robot nine = new Robot(1,9,0,20);
      for (int piles = 0; piles < 5; piles++)
      {
         for (int numOfBeepers = 0; numOfBeepers < 4; numOfBeepers++) {
            nine.putBeeper();
         }
         nine.move();
      }
      Robot ten = new Robot(1,10,0,50);
      if (!ten.nextToABeeper())
      {
         ten.putBeeper();
      }
      while (ten.frontIsClear())
      {
         if (!ten.nextToABeeper())
         {
            ten.putBeeper();
         }
         ten.move();
      }
      ten.putBeeper();
      Robot eleven = new Robot(1,11,0,50);
      while (!eleven.rightIsClear())
      {
         eleven.putBeeper();
         eleven.move();
      }
      Robot twelve = new Robot(1,12,0,50);
      while (twelve.rightIsClear() || !twelve.nextToABeeper())
      {
         twelve.move();
      }
   }
}
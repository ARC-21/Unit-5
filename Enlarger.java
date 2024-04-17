import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Enlarger extends Athlete
{
   private int[][] coords = new int[][] {{1,1},{1,2},{1,3},{2,1},{2,2},{2,3},{3,1},{3,2},{3,3}};
   //coords[] in form of (x, y)
   private int[] array = new int[] {0,0,0,0,0,0,0,0,0};
   private int scale;
   
   public Enlarger(int s)
   {
      super(1, 1, Display.NORTH, Display.INFINITY);
      scale = s;
   }
   /*
   public void enlarge()
   {
      scanModel();
      for (int i = 0; i < 9; i++)
      {
         if (array[i] == 1)
         {
            enlargePoint(coords[i], scale);
         }
         returnToSpot();
      }
   }*/
   public String enlarge(int c)
   {
      if (c == 9)
      {
         return null;
      }
      else
      {
         if (c == 0)
            scanModel(0);
         if (array[c] == 1)
         {
            enlargePoint(coords[c], scale, 0, 0);
         }
         returnToSpot();
         c += 1;
         System.out.println("count is " + c);
         return enlarge(c);
      }
   }
   /*
   public void scanModel()
   {
      for (int i = 0; i < 9; i++)
      {
         sprint(coords[i][0]-1);
         turnRight();
         sprint(coords[i][1]-1);
         if (nextToABeeper())
         {
            pickBeeper();
            array[i] = 1;
         }
         returnToSpot();
      }
      for (int x : array)
      {
         System.out.println("it is " + x);
      }
   }*/
   public String scanModel(int c)
   {
      if (c == 9)
         return null;
      else
      {
         sprint(coords[c][0]-1);
         turnRight();
         sprint(coords[c][1]-1);
         if (nextToABeeper())
         {
            pickBeeper();
            array[c] = 1;
         }
         returnToSpot();
         return scanModel(c+1);
      }
   }
   /*
   public void returnToSpot()
   {
      turnSouth();
      while (frontIsClear())
      {
         move();
      }
      turnWest();
      while(frontIsClear())
      {
         move();
      }
      turnRight();
   }*/
   public String returnToSpot()
   {
      turnSouth();
      if (frontIsClear())
      {
         move();
         return returnToSpot();
      }
      else
      {
         turnWest();
         if (frontIsClear())
         {
            move();
            return returnToSpot();
         }
      }
      turnRight();
      return null;
   }
   /*
   public void enlargePoint(int[] coord, int s)
   {
      turnRight();
      sprint(s*(coord[0]-1));
      turnLeft();
      sprint(s*(coord[1]-1));
      for (int x = 0; x < s; x++)
      {
         for (int y = 0; y < s; y++)
         {
            sprint(y);
            putBeeper();
            turnLeft();
            turnLeft();
            sprint(y);
            turnLeft();
            turnLeft();
         }
         turnRight();
         move();
         turnLeft();
      }
   }*/
   public String enlargePoint(int[] coord, int s, int x, int y)
   {
      if (x == s-1 && y == s)
         return null;
      else
      {
         if (x == 0 && y == 0)
         {
            turnRight();
            sprint(s*(coord[0]-1));
            turnLeft();
            sprint(s*(coord[1]-1));
         }
         if (y == s && x != s)
         {
            y = 0;
            x+=1;
            turnRight();
            move();
            turnLeft();
         }
         sprint(y);
         putBeeper();
         turnLeft();
         turnLeft();
         sprint(y);
         turnLeft();
         turnLeft();
         return enlargePoint(coord, s, x, y+1);
      }
   }
   /*public void turnSouth()
   {
      while (getDirection() != Display.SOUTH)
      {
         turnLeft();
      }
   }*/
   public String turnSouth()
   {
      if (getDirection() == Display.SOUTH)
      {
         return null;
      }
      else
      {
         turnLeft();
         return turnSouth();
      }
   }
   public String turnWest()
   {
      if (getDirection() == Display.WEST)
      {
         return null;
      }
      else
      {
         turnLeft();
         return turnWest();
      }
   }/*
   public void turnWest()
   {
      while (getDirection() != Display.WEST)
      {
         turnLeft();
      }
   }*/
}
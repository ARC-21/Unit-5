import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class Follower extends Athlete implements Followable
{
   public Follower()
   {
      super(2, 2, Display.EAST, 0);
   }
   
   public void follow()
   {
  
      while (1==1) {
         while(nextToABeeper())
         { 
               System.out.println("Going to Move Forward");
               if(frontIsClear()){
                  move();}
                  else {
                     turnLeft();
                     if(frontIsClear()){
                        move();}
                     else {
                        turnAround();
                        move();
                     }
               }         
            }
         
         turnAround();
         move();
         turnRight();

         if(frontIsClear()){
            move();
            }
         
         if(!nextToABeeper()){
            turnAround();
               move();
            if(frontIsClear()){
               move();
            }
            if(!nextToABeeper()){
               turnAround();
                  move();
               break;
             }
           }
         


         
       
     
         }

      
   }
}

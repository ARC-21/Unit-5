import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class patternArtistDriver
{
   public static void main(String[] args)
   {
      Display.openWorld("maps/D1.map");
      Display.setSize(10, 10);
      Display.setSpeed(8);
      patternArtist e = new patternArtist();
      e.copyPattern();
   }
}
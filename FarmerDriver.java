import edu.fcps.karel2.Display;

public class FarmerDriver
{
   public static void main(String[] args)
   {
      Farmer f;
      Display.openWorld("maps/field.map");
      f = new Harvester();
      workField(f);
      Display.openWorld("maps/field.map");
      f = new Planter();
      workField(f);
   }
}
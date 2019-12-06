

import java.util.Random;

public class Heads
{
   private  int heads = 0;
   private  int tails = 1;

   private int face;

   public Coin ()
   {
      flip();
   }



   public void flip ()
   {
      face = (int) (Math.random() * 2);
   }

   public boolean isHEADS ()
   {
      return (face == heads);
   }

   //-----------------------------------------------------------------
   //  Returns the current face of the coin as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String Name;

      if (face == HEADS)
         faceName = "You got heads";
      else
         faceName = "you got tails";

      return faceName;
   }
}

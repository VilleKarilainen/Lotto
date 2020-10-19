package fi.tuni.tamk.tiko.villekarilainen.util;



public class Math {
   /**
   *Creates a random value from the range of the given values min-max and returns it.
   *@param min the smallest number in the range of integres from which the random value is chosen from
   *@param max the largest number in the range of integres from which the random value is chosen from
   *@return the said randomly generated number
   */
    public static int getRandom(int min, int max) {
        return min + (int) (java.lang.Math.random() * ((max - min) + 1));
    }
}

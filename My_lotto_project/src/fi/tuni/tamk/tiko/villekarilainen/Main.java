
package fi.tuni.tamk.tiko.villekarilainen;
import java.io.Console; 
import fi.tuni.tamk.tiko.villekarilainen.util.Math;
import fi.tuni.tamk.tiko.villekarilainen.util.MyConsole;
import fi.tuni.tamk.tiko.villekarilainen.util.Arrays;

/**
* Will ask the user for the amount of numbers to play with, what is the largest acceptable number, and in how many years must the game be won in.
* It then calcutales how long it would take to get each match, and win within the said years.
* If the attempt took more than the given amount of years, it will calculate again.(short)
*
*Asks the user for the amount of numbers used in play, the largest possible number that can be given, and the time in which you need to win
*Uses the readInt method from MyConsole to ask the user for "amount" unique numbers.
*It then uses the calculateLotto method to generate an array with "amount" random unique numbers.
*To calculate the time, we assume each attempt for calculateLotto takes 1 week. 
*Using calculateLotto and the containSameValues method to calculate the time needed for each number from 1-max to match.
*Then it will print out how many years it took for each match by dividing the number of weeks taken by 52, the number of weeks in a year.
*Then, if it took more than the given amount of years to win the calculation process will repeat.
*If it took less than the given amount of years to win, the system will print "You won!", and the game will end.
*@author Ville Karilainen
*/

public class Main {
    public static void main(String [] args) {
        Console c = System.console();
        int week = 0;
        System.out.println("Play with how many numbers?");
        int amount = Integer.parseInt(c.readLine());
        System.out.println("What shall be the largest acceptable number?");
        int limit = Integer.parseInt(c.readLine());
        System.out.println("In what time must the player win? One lifetime is about 120 years. Please input the years in which victory must happen:");
        int years = Integer.parseInt(c.readLine());
        int [] lotto = MyConsole.readInt(amount, 1, limit, "Not a number", "Input must be from range");
        do{
        
        int [] Array = calculateLotto(amount,limit);
        
        
            week = 0;
           for(int x = 1; x<=amount; x++){
                do {
                    Array = calculateLotto(amount,limit);
                    Arrays.containsSameValues(Array, lotto);
                    week =week + 1;
                }while(!(Arrays.containsSameValues(Array,lotto) == x));
            
            System.out.println("");
            System.out.println( x + " " + "Matches!");   
            System.out.println("Results:"); 
            System.out.println("Took"+ " " + week/52 + " " +"years");
            }
            if (week/52>years){
                System.out.println("That was"+" "+(week/52-years)+" " + "years away from victory. Let's try that again");
            
            }
            else {
                System.out.println("You won!");
            }
        }while (week/52>years);
    }
    /**
    *The calculateLotto method creates an array with x amount of random integers from 1 to y. (short)
    *Using the Math.getRandom application, calculateLotto generates an Array with x amount of unique numbers.
    *In the case of a non-unique number, calculateLotto will generate a different one using Math.getRandom.
    *It uses the contains method found in Arrays to check if the new number is already in the array.(long)
    @param x how many different numbers will be in the array
    @param y the largest acceptable number that can be put in the array.
    @return The array with x amount of unique numbers ranging from 1 to y.
     */
    private static int[] calculateLotto(int x, int y) {
        int [] Array = new int [x];
        for (int i = 0; i<x; i++){
            Array[i]=Math.getRandom(1,y);
            if (Arrays.contains(Array[i], Array)){
                Array[i]=Math.getRandom(1,y);
            }
        }
    return Array; 
    }
}
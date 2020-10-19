
package fi.tuni.tamk.tiko.villekarilainen.util;

import fi.tuni.tamk.tiko.villekarilainen.util.Arrays;

import java.io.Console;  

public class MyConsole {
    /**
*Asks the user for "amount" of numbers, ranging from min to max. Fills an array "lotto" with said numbers, and returns it.(short)
*
*Uses a boolean value "check" to check when the given input is proper.
*
*If the given input is already within lotto, it will ask for a new unique number. Checking is done using the contains method from Arrays.
*If the given input is outside of the asked range min to max, it will ask again and display errorMessageNonMinAndMax.
*If the given input is not a number, it will ask again and display errorMessageNonNumeric.(long)
*@param amount how many numbers will be asked from the user, and how long the array will be.
*@param min the smallest acceptable value that the user may give to the array.
*@param max the largest acceptable value that the user may give to the array.
*@param errorMessageNonNumeric the error message that will be displayed when the given input is not a number.
*@param errorMessageNonMinAndMax the error message that will be displayed when the given input is outside of the min and max range.
*@return the integer array "lotto" with seven unique numbers.
 */
    public static int [] readInt(int amount, int min, int max, String errorMessageNonNumeric, String errorMessageNonMinAndMax){
        Console c = System.console();
        boolean check = true;
        int input = 0;
        int [] lotto = new int [amount];
        System.out.println("Give" + " " + amount + " " + "numbers ranging from " + " " + min + " " + "to" + " " + max );
        for (int i = 0; i<amount; i++){  
            do{
                try{
                    input = Integer.parseInt(c.readLine());
                    if (!(Arrays.contains(input, lotto))){
                        lotto [i] = input;
                        check = false;
                        }
                    else if (Arrays.contains(input, lotto)){
                        System.out.print("Must be unique number");
                        check = true;
                    }
                }
                catch(NumberFormatException e){
                    System.out.println(errorMessageNonNumeric);
                    check = true;
                }
                if (input<min || input>max){
                    System.out.println(errorMessageNonMinAndMax);
                    check = true;
                }
            }while (check); 
        }
    return lotto;
    }
}
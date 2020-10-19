package fi.tuni.tamk.tiko.villekarilainen.util;
public class Arrays {
    /**
    * Converts a string type array into an int type array. (Short)
    * Goes through the given String type array, and one by one transfers itself into an int type array(Long)
    *@param array is the given string type array, which is turned into an int type array named list. 
    *@return int array containing the integer version of the given string array
     */
    public static int [] toIntArray(String [] array) {
        
        int [] list = new int [array.length];
        for (int i = 0; i<array.length; i++){
            list [i] = Integer.parseInt(array[i]);
        }
        return list;
    }
    /**
    * Searches the array for the value, and returns true if it's found and false if not (Short)
    *Will go through the given array, and search for the integer value 
    *If Value is found, it will return "True", and if not it will return "False" (Long)
    *@param value is the value to be searched in the array
    * @param array is the array that will be searched for the value
    *@return true if the value is found and false if it is not
     */
    public static boolean contains(int value, int [] array) {
        boolean output = false;
        for (int i = 0; i<array.length; i++){
            if (array[i] == value){
                output = true;
            }
        }
        if (output){
            return true;
        }
        else {
            return false;
        }
    }
    /**
    *Returns how many values in array1 and array2 matched (Short)
    * @param array1 the first array to be compared
    * @param array2 the second array to be compared  
    * @return how many integers matched between the two arrays
     */
    public static int containsSameValues(int [] array1, int [] array2) { 
        
         int match = 0;
         for (int i = 0; i<array1.length; i++){
             for (int j=0; j<array2.length; j++){
                if (array1[i]==array2[j]){
                    match +=1;
                }
             }
         }
        return match;
    } 
}
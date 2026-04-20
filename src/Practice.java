import java.util.HashSet;
import java.util.ArrayList;
import java.util.HashMap;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
        // Initialize the greatest and smallest number as the first number in the array.
        int greatest = nums[0];
        int smallest = nums[0];

        // Find the greatest number in the array, find the smallest number in the array
        for (int i=1;i<nums.length;i++) {
            int num = nums[i];
            if      (num > greatest) greatest = num;
            else if (num < smallest) smallest = num;
        }
        // Return the difference between the greatest and smallest number
        return (greatest-smallest);
    }

    /**
     * Returns the longest word that starts with a specific character letter in an
     * ArrayList
     * 
     * @param list a list of words
     * @param c the character the word should start with
     * @return the longest word; "" if no word starts with the character
     */
    public static String getLongestWordStartingWithChar(ArrayList<String> list, char c) {
        String longestWord = "";

        // For each word
        for (String word : list) {
            // If the first character starts with the desired character
            if (word.charAt(0) == c) {
                // And the word is longer than the current longest word
                if (word.length() > longestWord.length()) {
                    // It is the new longest word.
                    longestWord = word;
                }
            }
        }
        // Return the longest word
        return longestWord;
    }


    /**
     * Returns how many words are longer than n characters and shorter than m
     * characters in a HashSet
     * 
     * @param words set of words
     * @param n     the minimum length of a counted word, non-inclusive
     * @param m     the maximum length of a counted word, non-inclusive
     * @return amount of words that pass either threshold
     */
    public static int countWordsByLength(HashSet<String> words, int n, int m) {
        int count = 0;

        // For each word
        for (String word : words) {
            // If the word is greater than n, and shorter than m
            if (word.length() > n && word.length() < m) {
                // Increment count
                count++;
            }
        }
        // Return count
        return count;
    }

    /**
     * Returns the difference between the amount of odd and even numbers in the values
     * of a HashMap
     * 
     * @param map map of Integers
     * @return difference between amount of odd and even numbers of the values
     */
    public static int oddEvenDiff(HashMap<Integer,Integer> map) {
        int evenNums = 0;
        int oddNums = 0;

        // For each value
        for (Integer num : map.values()) {
            // If num is even, Increment evenNums
            if (num % 2 == 0) evenNums++;
            // If num is odd, Increment oddNums
            else oddNums++;
        }
        
        // Return difference between evenNums and oddNums
        return Math.abs(evenNums - oddNums);
    }

    /**
     * Returns the second-largest number in the keys of a HashMap
     * 
     * @param map map of Integers
     * @return the second largest integer of the keys
     */
    public static int getSecondLargest(HashMap<Integer,Integer> map) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = largest;
        // For each key
        for (Integer num : map.keySet()) {
            // If key is largest
            if (num >= largest) {
                // Set second largest to current largest
                // Set current largest to key
                secondLargest = largest;
                largest = num;
            }
        }
        // If there's only one int in the map, then the secondLargest IS the largest.
        if (secondLargest == Integer.MIN_VALUE) secondLargest = largest;
        // Return second largest
        return secondLargest;
    }
}

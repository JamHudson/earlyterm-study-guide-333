import java.util.HashSet;
import java.util.ArrayList;

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

    // TODO: Implement the other methods from the README AND tests for each one

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

    // Count how many words are longer than n characters and shorter than m characters in a HashSet
    public static int countExtremeWords(HashSet<String> words, int n, int m) {
        int count = 0;

        for (String word : words) {
            if (word.length() > n && word.length() < m) {
                count++;
            }
        }

        return count;
    }

    // Find the difference between the amount of odd and even numbers in the values of a HashMap

    // Find the second-largest number in the keys of a HashMap
}

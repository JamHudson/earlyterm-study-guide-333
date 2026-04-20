import java.util.*;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class PracticeTest {

    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }

    @Test
    void testMaxDiffSingleNumber() {
        // Arrange
        int[] numbers = {1};
        // Act
        int actual = Practice.maxDiff(numbers);
        // Assert
        assertEquals(0,actual);
    }

    @Test
    void testMaxDiffMultipleGreatest() {
        int[] numbers = {0,1, 4, 2, 8, 8, 8};

        int actual = Practice.maxDiff(numbers);

        assertEquals(8,actual);
    }

    @Test
    void testMaxDiffMultipleSmallest() {
        int[] numbers = {0,0,0,3,0,2,3,2,5,2,4,12};

        int actual = Practice.maxDiff(numbers);

        assertEquals(12,actual);
    }

    @Test
    void testGetLongestWordWithSpaceStart() {
        ArrayList<String> words = new ArrayList<>();
        words.add("fdlksd");
        words.add("dlfkjgs");
        words.add("dlkbdsljkfd");
        words.add("spoweimb");
        words.add("    woidjfeim");
        words.add("ljewoijoiw     ");
        words.add(" THISISWHATSHOULDBERETURNED");

        String actual = Practice.getLongestWordStartingWithChar(words, ' ');

        assertEquals(" THISISWHATSHOULDBERETURNED",actual);
    }

    @Test
    void testGetLongestWordAllSameWord() {
        ArrayList<String> words = new ArrayList<>();
        words.add("wordies");
        words.add("wordies");
        words.add("wordies");
        words.add("wordies");
        words.add("wordies");
        words.add("wordies");
        words.add("wordies");
        words.add("wordies");

        String actual = Practice.getLongestWordStartingWithChar(words, 'w');

        assertEquals("wordies", actual);
    }

    @Test
    void testGetLongestWordLongestNotCharMatched() {
        ArrayList<String> words = new ArrayList<>();
        words.add("thisrighthereisthelongestwordEVER");
        words.add("butthisonestartswithB");

        String actual = Practice.getLongestWordStartingWithChar(words, 'b');

        assertEquals("butthisonestartswithB", actual);
    }
    
    @Test
    void testCount5to10() {
        HashSet<String> words = new HashSet<>();
        words.add("fail");
        words.add("passes");
        words.add("success");
        words.add("failsverybadly");
        words.add("failsveryverybadly");

        int actual = Practice.countWordsByLength(words, 5, 10);

        assertEquals(2,actual);
    }

    @Test
    void testCount5to5() {
        HashSet<String> words = new HashSet<>();
        words.add("fail");
        words.add("noped");
        words.add("failsverybadly");
        words.add("failsveryverybadly");
        words.add("superevilwordthatshouldn'twork");

        int actual = Practice.countWordsByLength(words, 5, 5);

        assertEquals(0, actual);
    }

    @Test
    void testCountAllFails() {
        HashSet<String> words = new HashSet<>();
        words.add("fail");
        words.add("wompwomp");
        words.add("womp");
        words.add("loseing");
        words.add("failsverybadly");
        words.add("failsveryverybadly");
        words.add("superevilwordthatshouldn'twork");

        int actual = Practice.countWordsByLength(words, -2, -2);

        assertEquals(0, actual);
    }

    @Test
    void testOddEvenDiffOddOnly() {
        HashMap<Integer,Integer> numbers = new HashMap<>();
        numbers.put(1,1);
        numbers.put(2,5);
        numbers.put(3,3);
        numbers.put(4,7);
        numbers.put(5,1);

        int actual = Practice.oddEvenDiff(numbers);

        assertEquals(5, actual);
    }

    @Test
    void testOddEvenDiffEvenOnly() {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        numbers.put(1, 2);
        numbers.put(2, 6);
        numbers.put(3, 4);
        numbers.put(4, 8);
        numbers.put(5, 2);

        int actual = Practice.oddEvenDiff(numbers);

        assertEquals(5, actual);
    }

    @Test
    void testOddEvenDiffBoth() {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        numbers.put(1, 2);
        numbers.put(2, 2);
        numbers.put(3, 2);
        numbers.put(4, 2);
        numbers.put(5, 1);
        numbers.put(6, 1);
        numbers.put(7, 1);

        int actual = Practice.oddEvenDiff(numbers);

        assertEquals(1, actual);
    }

    @Test
    void testOddEvenDiffZero() {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        numbers.put(1, 0);
        numbers.put(2, 2);
        numbers.put(3, 2);
        numbers.put(4, 2);
        numbers.put(5, 1);
        numbers.put(6, 1);
        numbers.put(7, 1);

        int actual = Practice.oddEvenDiff(numbers);

        assertEquals(0, actual);
    }

    @Test
    void testSecondLargest() {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        numbers.put(2, 1);
        numbers.put(1, 2);
        numbers.put(7, 3);
        numbers.put(4, 4);
        numbers.put(6, 5);

        int actual = Practice.getSecondLargest(numbers);

        assertEquals(6, actual);
    }

    @Test
    void testSecondLargest2() {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        numbers.put(5, 1);
        numbers.put(3, 2);
        numbers.put(8, 3);
        numbers.put(4, 4);
        numbers.put(2, 5);

        int actual = Practice.getSecondLargest(numbers);

        assertEquals(5, actual);
    }

    @Test
    void testSecondLargestNegativesAndPositives() {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        numbers.put(-3,0);
        numbers.put( 3,1);
        numbers.put(-6,2);
        numbers.put( 4,3);
        numbers.put(-1,4);

        int actual = Practice.getSecondLargest(numbers);

        assertEquals(3, actual);
    }

    @Test
    void testSecondLargestOnlyNegatives() {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        numbers.put(-3,1);
        numbers.put(-104,2);
        numbers.put(-105,3);
        numbers.put(-106,4);
        numbers.put(-1,5);

        int actual = Practice.getSecondLargest(numbers);

        assertEquals(-3, actual);
    }

    // Is this test redundant? There's only one value in this one...
    // @Test
    // void testSecondLargestAllSame() {
    //     HashMap<Integer, Integer> numbers = new HashMap<>();
    //     numbers.put(1, 1);
    //     numbers.put(1, 2);
    //     numbers.put(1, 3);
    //     numbers.put(1, 4);
    //     numbers.put(1, 5);

    //     int actual = Practice.getSecondLargest(numbers);

    //     assertEquals(1, actual);
    // }

    @Test
    void testSecondLargestOneNumber() {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        numbers.put(3, 1);

        int actual = Practice.getSecondLargest(numbers);

        assertEquals(3, actual);
    }
}



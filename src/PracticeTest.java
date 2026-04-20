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
}



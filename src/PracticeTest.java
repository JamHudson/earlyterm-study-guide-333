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

    // TODO: Make tests for each problem you solve
    
}



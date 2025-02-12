package se.bergenstrale;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

public class AppTest {
    @Test
    void calculate2plus3() {
        var expected = 5;
        var result = App.calculate("2 + 3");

        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculate3times2plus1() {
        var expected = 7;
        var result = App.calculate("3 * 2 + 1");

        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculate3timesMinus2plus6() {
        var expected = 0;
        var result = App.calculate("3 * -2 + 6");

        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculateHandlesMultipleOperatorsInRow() {
        var expected = 11;
        var result = App.calculate("3 * - -2 + 6");

        Assertions.assertEquals(expected, result);
    }
    @Test
    void calculateDoesntConsiderOrderOfOperations() {
        var expected = 11;
        var result = App.calculate("5 + 2 * 3");

        Assertions.assertNotEquals(expected, result);
    }

    @Test
    void calculateThrowsOnBadCharacter() {
        Assertions.assertThrows(InputMismatchException.class, () -> App.calculate("2 + 3v") );
    }
}

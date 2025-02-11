package se.bergenstrale;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}

package net.efrei.ohce;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ReverserTest{
    @Test
    public void shouldReverseString() {
        final String inputString = "foo";
        assertEquals("oof", Reverser.reverse(inputString));
    }

    @Test
    public void shouldDetectPalindromes() {
        final String inputString = "ici";
        assertEquals("ici\nBonita Palabra", Reverser.reverse(inputString));
    }
}

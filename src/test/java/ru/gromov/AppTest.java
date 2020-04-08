package ru.gromov;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void main() {
        App test = new App();
        assertEquals("44 444", test.spelling("hi"));
        assertEquals("999337777", test.spelling("yes"));
        assertEquals("333666 6660 022 2777", test.spelling("foo  bar"));
        assertEquals("4433555 555666096667775553", test.spelling("hello world"));
    }
}
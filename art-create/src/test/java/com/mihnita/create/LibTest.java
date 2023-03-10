package com.mihnita.create;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Unit test for simple Library.
 */
@RunWith(JUnit4.class)
public class LibTest {
	private final static String DEFAULT_HELLO = "Hello World!";

    @Test
    public void testDefault() {
		assertEquals(DEFAULT_HELLO, Lib.sayHi());
	}

    @Test
    public void testNull() {
		assertEquals(DEFAULT_HELLO, Lib.sayHi(null));
	}

    @Test
    public void testEmpty() {
		assertEquals(DEFAULT_HELLO, Lib.sayHi(""));
	}

    @Test
    public void testName() {
		assertEquals("Hello John!", Lib.sayHi("John"));
	}
}

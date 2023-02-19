package com.mihnita.consume;

import static org.junit.Assert.assertEquals;

import com.mihnita.create.Lib;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Unit test for simple App.
 */
@RunWith(JUnit4.class)
public class AppTest {
    @Test
    public void testDefault() {
		assertEquals("Hello World!", Lib.sayHi());
	}

    @Test
    public void testName() {
		assertEquals("Hello Steve!", Lib.sayHi("Steve"));
	}
}

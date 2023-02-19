package com.mihnita.create;

/**
 * Hello world library
 */
public class Lib {
    public static String sayHi() {
		return sayHi(null);
	}

    public static String sayHi(String name) {
		if (name == null || name.isEmpty()) {
			return "Hello World!";
		} else {
			return "Hello " + name + "!";
		}
	}
}

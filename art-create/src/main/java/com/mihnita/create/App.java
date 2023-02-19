package com.mihnita.create;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(sayHi());
    }

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

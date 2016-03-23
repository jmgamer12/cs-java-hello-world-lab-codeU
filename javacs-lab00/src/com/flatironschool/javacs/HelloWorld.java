package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
	    return Double.parseDouble(System.getProperty("java.specification.version"));
      // I won't work!
    }

    public static void main(String[] args) {
	    System.out.println(getVersion());
	    // you can test the output of getVersion() here
    }
}

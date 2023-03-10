package com.skwaweru254;

class TestThis {
    TestThis() {

        //default constructor
        //this(5);
        System.out.println("We are there");

    }

    TestThis(int v) {

        //parameterized constructor
        this();
        System.out.println(v);
    }
}

public class ThisIsJava2 {
    public static void main(String [] args) {
        TestThis b = new TestThis(10);
    }
}
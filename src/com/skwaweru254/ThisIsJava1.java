package com.skwaweru254;

class ThisPrint {
    void m() {
        System.out.println("We know this?");
    }

    void n() {
        System.out.println("We invoke m method!");
        this.m();
    }
}

class ThisIsJava1 {
    public static void main(String[] args) {

        // initiating object p from class ThisPrint
        ThisPrint P = new ThisPrint();
        // invoke the class method from ThisPrint class instance
        P.n();
    }
}
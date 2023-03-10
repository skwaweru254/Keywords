package com.skwaweru254;

class ThisIsJava{
    String name;
    float salary;
    ThisIsJava(String name,float salary){
        this.name=name;
        this.salary=salary;
        /*distinguish local variable and instance variable by using this keyword*/
    }
    void display(){System.out.println(name+" earns "+salary);}
}
class TestThis1{
    public static void main(String[] args){
        ThisIsJava s1=new ThisIsJava("Simon",80000);
        ThisIsJava s2=new ThisIsJava("Waweru",70000);
        s1.display();
        s2.display();
    }}

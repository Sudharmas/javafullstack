package org.maven;
import java.lang.*;
public class method_overriding extends override{
    public static void main(String[] args) {

        override obj = new override();
        obj.area(10);
    }

    public static void area(int a){
        System.out.println("area is :"+ a*a);
    }
}
class override{
    public static void area(int b) { //overriding the area
        System.out.println("area is also equal to :" + b * b *b);
    }
}
class override1 extends override{
    public static void area(int c){ //overriding the area again
        System.out.println("Area is also even :"+ c*c*c*c);
    }
}

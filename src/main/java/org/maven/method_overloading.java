package org.maven;

public class method_overloading {
    public static void main(String[] args) {

        System.out.println("area of square is:"+area(10,20));
        System.out.println("area of square is:"+area(10));
        System.out.println("area of square is:"+area(10.0));
        System.out.println("area of square is:"+area(10.0));
    }
    public static int area(int h,int w){
        return h*w;
    }
    public static int area(int s){
        return s*s;
    }
    public static double area(double d){
        return d*d;
    }
}

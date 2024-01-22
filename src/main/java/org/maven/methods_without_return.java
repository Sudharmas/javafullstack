package org.maven;

public class methods_without_return {

    public static void main(String[] args) {
        area(10,20);//calling the function

    }
    public static void area(int height,int breadth){
        System.out.println("area is : "+ height*breadth);//display the output directly inside the method without taking the value back from methods
    }
}

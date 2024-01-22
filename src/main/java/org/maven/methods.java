package org.maven;

public class methods {
//    methods without parameters
    public static void main(String[] args) {

        loop1();//calling a function
        System.out.println("**************");
        loop2();//calling another function
        
    }
    //we declare a method outside the main funtion and inside the class which we can run
    public static void loop1(){//function declaration
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }public static void loop2(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}

package org.maven;

public class methods_with_parameters {
    //methoods with parameters(direct values)
    public static void main(String[] args) {
        loop1(1, 10);//calling the function loop1 and passing arguments inside the function
    }
    //the values that are passed while calling a function are known as arguments
    //the values or variables that accept the arguments passed to a function and hold the value of an argument is known as parameters

    public static void loop1(int x, int y) {//declaring the function and passing parameters to the function
        for (int i = x; i < y; i++) {
            System.out.println(i);
        }
    }
}

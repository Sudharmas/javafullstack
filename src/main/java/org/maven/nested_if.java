package org.maven;

import java.util.Scanner;

public class nested_if {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //declaring a scanner variable to intake variables
        int a;
        int b;
        int c;//declaring 3 variables
        System.out.println("Enter values of a,b,c:");
        System.out.println("\na:");
        a = s.nextInt();//assigning value to a by scanning variable from console
        System.out.println("\nb:");
        b = s.nextInt();//assigning value to b by scanning variable from console
        System.out.println("\nc:");
        c = s.nextInt();//assigning value to c by scanning variable from console
        if(a>b){
            if(a>c){
                System.out.println("a is greater");
            }
            else {
                System.out.println("c is greater");
            }
        }
        else if(b>c){
            System.out.println("b is greater");
        }
        else{
            System.out.println("c is greater");
        }
    }
}

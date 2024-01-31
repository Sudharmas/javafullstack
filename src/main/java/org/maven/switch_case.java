package org.maven;

public class switch_case {
    public static void main(String[] args) {
        int n = 1;
        // syntax: 
        /*  switch(condition){
             case 1:statement;
                 break;
                 .
                 .
                 .
             default:statement;
         }  */
        switch (n){//switch  statement declaration
            case 1 ://case statement 1
                System.out.println(n);
                break;
                case 2 ://case statement 2
                System.out.println(n+1);
                break;
        }
    }
}

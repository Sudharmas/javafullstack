package org.maven;

public class do_while_loop {
    public static void main(String[] args) {

        int i = 0;//initializing i = 0
        //do while loop is executes the do{} statement atleast once and then checks the while condition
        do {
            System.out.println("i=" + i);//printing value of i
            i++;//incrementing value of i
        } while (i < 10);
    }
}

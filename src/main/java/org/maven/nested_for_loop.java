package org.maven;

public class nested_for_loop {
    public static void main(String[] args) {

// we use nested for loops to initailize matrices and multidimensional arrays,stacks,linked lists,etc..
        //for loop written inside another for loop is a nested loop.
        for (int i = 0; i < 5; i++) {
            for (int j = 0;j  < 5;j ++) {
                System.out.println("i:"+i+" j:"+j);
            }
        }
    }
}

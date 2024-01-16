package org.maven;

public class nested_for_loop {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        for (i = 0; i < 5; i++) {
            for (j = 0;j  < 5;j ++) {
                System.out.println("i:"+i+" j:"+j);
            }
        }
    }
}

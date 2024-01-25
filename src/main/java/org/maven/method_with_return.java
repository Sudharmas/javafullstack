package org.maven;

public class method_with_return {
    public static void main(String[] args) {
        int area = areaofsquare(2);//function call , the value returned from the function is stored inside variable area
        System.out.println(area);//printing the returned value
    }
    public static int areaofsquare(int x){
        return x*x;// returning the value to the main function or inside called function
    }
}

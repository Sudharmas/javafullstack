package org.maven;

public class method_overloading {
    public static void main(String[] args) {
// Method overloading occurs whenever there is same method name but used multiple times in same file or class
        System.out.println("area of square is:"+area(10,20));//passing 2 parameters
        System.out.println("area of square is:"+area(10));//passing only 1 parameter
        System.out.println("area of square is:"+area(10.0));//passing a parameter with floating point or decimal value
        System.out.println("area of square is:"+area(10.0));
    }
    public static int area(int h,int w){//area method declaration with 2 parameters passed
        // when we use function call with 2 parameters ,this method will be invoked automatically and other methods are rejected
        return h*w;
    }
    public static int area(int s){//area method with one parameter passed
        // when we use only one parameter inside a funvtion call.and if the parameter is integer then this method will be automatically called and other methods are rejected
        return s*s;
    }
    public static double area(double d){//area method with decimal number parameter
        // when we use a decimal point number as a parameter then this method is invoked. we have to give the methid type as double to return the decimal value to main function,else type conversion error will be thrown
        return d*d;
    }
}

/* output for this code*/
// area of square is:200 ---->this will be the output if 2 parameters are passed
// area of square is:100 ---->this will be the output if only one parameter with type integer is passed
// area of square is:100.0 ---->this will be the output if decimal type parameter passed to method declarewd with double type
// area of square is:100.0 ---->output for last line

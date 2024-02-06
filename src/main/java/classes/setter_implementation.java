package classes;

public class setter_implementation {
    public static void main(String[] args) {
        setter_method obj = new setter_method();
        // initially the value of x was 5 ,now we are assigning value of x to 10 by setter method.
        // we are creating object for setter_methods class and passing parameter to setX method using object.
        obj.setX(10);
        int a = obj.getX();//calling getX method to know that the value has been changed
        System.out.println(a);
    }
}

/*
output:
10
*/
// now the value of x changed to 10 and will be displayed

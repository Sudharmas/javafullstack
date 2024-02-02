package classes;

public class getter_methods {
    // here the variables are fdecalred as private ,and they are only accessible inside this class
    private int x = 5;
    private  int y;
    private int z;
// but if we want to use these variables in another class or display it in another class then we use getter methods
    // getter methods are named with 'get'prefix added to the varaibles that will be used
    public int getx(){
        return x; // here we are returning the variables to the method which calls this getx method. 
        // we can only use or return a variable if we use getter methods,else we cannot access the variables in another function
    }
}


package classes;

public class getter_method_implementation {
     // we can get the variable x declared in the class getter_methods using objects and calling getx method
    public static void main(String[] args) {
        getter_methods obj = new getter_methods();//object creation
                // obj.getx() calls getx method which returns value of x to this function
        System.out.println(obj.getx());
    }

}

/*
out put
    5
    */
// NOTE: The output will be zero if we donot initialize the variable and if we access the variable 


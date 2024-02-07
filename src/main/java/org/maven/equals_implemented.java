package org.maven;

import java.util.Objects;

public class equals_implemented {
    private  String a= "Hello";

    public String ab(){
        // .equals used to check similarity between values,i.e,if we want to chech whether the value of varaible is equal to any desired value or not.
        if(a.equals("Hello")){// .equals check whether the string inside brackets are equal or not and then return true or false
        return "Hello";//if equals is true then this will be returned
        }
        else {
            return "Unequal";//else this will be returned
        }
    }
}


package classes;

public class setter_method {
    private int x=5;
// NOTE: we can use stter methods to implement encapsulation using java.
    // setter methods are used to set the values for private variavbles only if needed,else ther value cannot be changed.
    // syntax: public void set<var>(parameter){ this.var = var; }
   
    public void setX(int x) {
        this.x = x;//this keyword is used to assign value to variable,we cannot assign the value to variable ,so we use this keyword to assign new value to variable.

    }


}
    public int getX() {// getter method to get or return value of x
        return x;
    }
}

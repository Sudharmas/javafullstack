package classes;

public class setter_method {
    private int x=5;

    // setter methods are used to set the values for private variavbles only if needed,else ther value cannot be changed.
    // syntax: public void set<var>(parameter){ this.var = var; }
    
    public void setX(int x) {
        this.x = x;//this keyword is used to assign value to variable,we cannot assign the value to variable ,so we use this keyword to assign new value to variable.

    }


}

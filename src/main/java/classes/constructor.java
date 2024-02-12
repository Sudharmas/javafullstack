package classes;

public class constructor {
    public int a;
    public int b;
    public int c;

      // this is a constructor with arguments p,q,r
    // we can manually create a constructor with same name as classname ,and always it should be as same as classname
    // we use constructors to assign value to variables declared inside a class using objects for that class inside main function.
    // here values are assigned to a,b,c by taking parameters from main function and storing it inside p,q,r
    public constructor(int p, int q, int r) {
        a = p;
        b = q;
        c = r;
    }
}

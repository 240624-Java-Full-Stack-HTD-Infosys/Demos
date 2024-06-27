package com.revature.JavaClasses;
/*
Access modifiers:
Most to least restrictive:
private - inaccessible anywhere outside the class
package private - private + all other classes in the same package can access
protected - package private + all derived (children, grandchildren, descendants) of the class
public - accessible anywhere
 */

/*
non-access modifiers:
static - member associated with the class, not an individual object
default - has to do with interfaces
final - cannot be reassigned
abstract - has to do with interfaces and abstract classes
 */
public class ClassA{
    int a; //"package private" AKA "default"
    private int b;//private
    public boolean c = true;
    protected int d;

    public ClassA() {
        //this is the default constructor
    }

    public ClassA(int a, int b) {
        //this constructor is an "initializer"
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public boolean isC() {
        return c;
    }


}

import java.sql.Connection;
import java.util.LinkedList;
import java.util.List;

public class Primitives {
    //primitive data types in java
    int a = 97; //32-bits - 1100001
    short b = 32000;//16 bits
    long c = 44; //64-bit
    byte d = 127; //8-bit
    float e = 1.2f;
    double f = 4.4;
    char g = 'a'; //1100001
    boolean h = false;

    //arrays aren't primitives themselves, but often will hold a number of primitives.
    int[] arr = new int[]{1,2,3};

    //Wrapper classes, one for each primitive, can be autoboxed
    Integer aa = 97;
    Short bb = 32000;
    Long cc = 44l;
    Byte dd = 127;
    Float ee = 1.2f;
    Double ff = 4.4;
    Character gg = 'a';
    Boolean hh = true;

    //Everything that isn't a primitive is a class/object, including the wrapper classes.
    Object o;
    Connection con;

    //Strings are also objects, not primitives, but are about as ubiquitous as primitives are, and are
    // treated in special ways, just like the wrappers.
    String helloWorld = "Hello World!";




    public static void main(String[] args) {
        List<Integer> myList = new LinkedList<>();
        int y = 9;
        myList.add(y);

        String s = "Hello";
        String asdf = new String("Hello");
        asdf.intern();
        s = "not hello";
        String ss = s;


        String ab = "a" + "b";
        //let there be a String called abc
        //let abc point to the string in the pool with a value of "a"
        //let there be a string with value "b"
        //concatenate a and b to get ab
        //let there be a string with a value "ab"

        StringBuffer sb = new StringBuffer();
        sb.append('a');
        sb.append('b');
        String myString = sb.toString();


        System.out.println(ss);

    }


}

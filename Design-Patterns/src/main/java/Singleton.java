
/*
The purpose of singleton is to have one and only one instance of a class
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {

    }

    public static Singleton getSingleton() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }


}

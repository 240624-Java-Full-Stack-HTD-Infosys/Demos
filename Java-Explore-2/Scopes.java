public class Scopes {
    static int y = 7;

    public static void main(String[] args) {
        int x = 5;
        System.out.println(y);
        method2();

        {
            int z  = 8;
            System.out.println(x);
        }
        //System.out.println(z);//z is out of scope here!

    }

    public static void method2() {
        int x = 10;
    }
}

public class Main {
    public static void main(String[] args) {

        String s = "hello".toUpperCase();
        //a = 01, b=2, h=8, e=5, l=12, o=15

        String answer = "0805121215";

        if(Solution.generateSecretCode(s).equals(answer)) {
            System.out.println("TRUE!");
        } else {
            System.out.println("FALSE!!!");
        }

    }
}

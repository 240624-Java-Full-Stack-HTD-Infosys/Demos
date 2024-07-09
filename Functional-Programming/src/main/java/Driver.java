import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Driver {
    private static final int z = 3;
    public static void main(String[] args) {
        MyFunctionalInterface doubleIt = (n) -> {return n * 2;};
        MyFunctionalInterface subtractIt = (n) -> {return n - 2;};

        int result1 = doubleIt.doMath(2);
        int result2 = subtractIt.doMath(8);


        List<Integer> intList = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            intList.add(i);
        }

        intList = intList.stream().filter((x)->x % 2 == 0).toList();


        for(int x : intList) {
            System.out.println(x);
        }

        intList.stream().filter(Driver::isEven).forEach((x)-> {
            System.out.println(x);
        });
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }
}

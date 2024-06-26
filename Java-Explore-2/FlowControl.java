import java.util.ArrayList;
import java.util.List;

public class FlowControl {
    public static void main(String[] args) {
        int x = 3;
        int y = -1;
        String str = "A";
        System.out.println(x + y);

        //branching
        if(x > 0) {
            System.out.println("X is greater than 0");
        }

        //if-else
        if(10 < 5) {
            //do this
        } else {
            //or do this
        }

        //if-else-if
        if(str == "A") {
            //if true do this
        } else if(str == "B") {
            //if the first thing was false, and this is true, do this
        } else if(str == "C") {
            //if the previous predicates were false, and this one is true, do this
        } else {
            //if all others were false, then finally do this.
        }

        //switch
        switch(str) {
            case "A":
                //if str is equal to "A" do this
                System.out.println(str);
                break;
            case "B":
                //if str == "B" do this
                System.out.println(str);
                break;
            case "C":
                //dkfgjnsdlfkgj
                System.out.println(str);
                break;
            default:
                //if none of the other cases are done, do this.
                System.out.println(str);
        }


        //looping
        //for loop
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //while
        int i = 0;
        while(i < 10) {
            System.out.println(i);
            i++;
        }

        //do-while
        int j = 12;
        do {
            System.out.println(j);
            j++;
        } while (j < 10);

        //enhanced for loop AKA for-in
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        for(Integer k : intList) {
            System.out.println(k);
        }



        //Jump & Return - method invocation


    }
}

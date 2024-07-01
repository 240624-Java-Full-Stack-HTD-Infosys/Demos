package vectortinkering;

import java.util.Iterator;

public class MyRunnableClass implements Runnable{//This one runs on vectors

    public void run() {
        Iterator<Integer> iter = Main.myVector.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
            iter.remove();

        }
    }
}

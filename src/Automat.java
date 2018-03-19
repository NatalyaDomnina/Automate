import java.util.ArrayList;

/**
 * Created by student on 05.03.2018.
 */

public class Automat {
    static ArrayList<Integer> sostoyanie = new ArrayList<Integer>();
    static ArrayList<String> perehod = new ArrayList<String>();
    static int counter = 0;
    static int lock = 1;
    static final Object O = new Object();

    static void execute() {
        synchronized (O) {
            sostoyanie.add(0);
            counter++;
            counter++;
            switch (sostoyanie.get(counter-2)) {
                case 1:
                    Counter.incC();
                    break;
                case 2:
                    Counter.dec();
                    break;
            }
            counter++;
            sostoyanie.add(-1);
            O.notifyAll();
        }
    }
    static void signal(String value) {
            perehod.add(value);
            synchronized (O) {
                while ((value == "Inc" && Counter.x >= 105) || (value =="Dec" && Counter.x <= 95)){
                    try {
                        O.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                switch (value) {
                    case "Inc":
    //              Перехов в инкримент
                        sostoyanie.add(1);
                        break;
                    case "Dec":
    //               Перехов в декримент
                        sostoyanie.add(2);
                        break;
                }
                while (sostoyanie.get(counter) == 0) {
                    try {
                        O.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            execute();
        }
    }
}

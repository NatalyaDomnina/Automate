/**
 * Created by student on 12.02.2018.
 */
public class Counter {
    static int x = 100;
    static final Object O = new Object();
    static void incC() {
        x++;
        System.out.println(x);
        System.out.println(Automat.perehod);
        System.out.println(Automat.sostoyanie);
    }
    static void dec() {
        x--;
        System.out.println(x);
        System.out.println(Automat.perehod);
        System.out.println(Automat.sostoyanie);
    }
}


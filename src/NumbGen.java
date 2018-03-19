import java.util.concurrent.TimeUnit;

/**
 * Created by student on 12.02.2018.
 */
public class NumbGen implements Runnable {
    int x = 0;

    @Override
    public void run() {
        while(!Thread.currentThread().isInterrupted()){
            try {
                Thread.currentThread().sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(x);
            x = x+1;
        }
    }
}

/**
 * Created by student on 12.02.2018.
 */
public class Dec implements Runnable {
    public Dec() {
    }

    void decC(){
        Automat.signal("Dec");
    }

    @Override
    public void run() {
        while(!Thread.currentThread().isInterrupted()){
            try {
                Thread.currentThread().sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            decC();
        }
    }
}

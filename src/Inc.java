/**
 * Created by student on 12.02.2018.
 */
public class Inc implements Runnable{
    public Inc() {
    }

    void incC() {
        Automat.signal("Inc");
    }

    @Override
    public void run() {
        while(!Thread.currentThread().isInterrupted()){
            try {
                Thread.currentThread().sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            incC();
        }
    }
}

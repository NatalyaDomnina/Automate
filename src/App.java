import java.util.ArrayList;

/**
 * Created by student on 12.02.2018.
 */
public class App {
    public static void main (String... args){
        Thread th = new Thread(new Inc());
        Thread th1 = new Thread(new Inc());
        Thread th2 = new Thread(new Inc());
        Thread th3 = new Thread(new Dec());
        //Thread th4 = new Thread(new Inc());
        Passport pas1 = new Passport("10", "20");
        Passport pas2 = new Passport("20", "30");
        Passport pas3 = new Passport("30", "40");
        Passport best = new Passport("000", "000");
        Passport pas4 = new Passport("40", "50");
        Passport pas5 = new Passport("50", "60");

        Man man1 = new Man (22, "Антон", "Рябов", "Константинович", pas1 );
        Man man2 = new Man (22, "Наталья", "Домнина", "Александровна", pas2);
        Man man3 = new Man (22, "Алексей", "Цветов", "Эдуардович", pas3);
        Man man4 = new Man (21, "Илья", "Сомкин", "Андреевич", best);
        Man man5 = new Man (22, "Родин", "Виктор", "Андреевич", pas4);
        Man man6 = new Man (22, "Кононова", "Ирина", "Викторовна", pas5);
        ArrayList<Man> people = new ArrayList<Man>();
        people.add(man1);
        people.add(man2);
        people.add(man3);
        people.add(man4);
        people.add(man5);
        people.add(man6);
        System.out.print(people);

        th.start();
        th1.start();
        th2.start();
        th3.start();
       // th4.start();

        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        th.interrupt();
        th1.interrupt();
        th2.interrupt();
        th3.interrupt();
        //th4.interrupt();
    }

}

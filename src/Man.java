/**
 * Created by student on 12.02.2018.
 */
public class Man {
    private int age;
    private String name;
    private String secondNema;
    private String patr;
    private Passport passport;

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {

        this.passport = passport;
    }

    public Man(int age, String name, String secondNema, String patr, Passport passport) {

        this.age = age;
        this.name = name;
        this.secondNema = secondNema;
        this.patr = patr;
        this.passport = passport;
    }

    public void setSecondNema(String secondNema) {
        this.secondNema = secondNema;
    }

    public void setPatr(String patr) {
        this.patr = patr;
    }

    public String getSecondNema() {

        return secondNema;
    }

    public String getPatr() {
        return patr;
    }

    @Override
    public String toString() {
        return "\n"+"Man{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", secondName='" + secondNema + '\'' +
                ", patr='" + patr + '\'' +
                ", passport=" + passport +
                '}';
}



    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}


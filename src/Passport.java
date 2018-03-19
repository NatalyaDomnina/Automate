/**
 * Created by student on 12.02.2018.
 */
public class Passport extends Document {
    String nomber;
    String serial;


    @Override
    public String toString() {
        return "Passport{" +
                "number='" + nomber + '\'' +
                ", serial='" + serial + '\'' +
                '}';
    }

    public void setNomber(String nomber) {
        this.nomber = nomber;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getNomber() {

        return nomber;
    }

    public String getSerial() {
        return serial;
    }

    public Passport( ) {
    }

    public Passport (String number, String serial){
        this.nomber = number;
        this.serial = serial;


    }
}

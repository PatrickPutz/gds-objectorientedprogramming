import java.sql.SQLOutput;

public class Konto {

    private String kontoInhaber;
    private double kontoStand;
    private int idNumber; // 1...999999
    private static int s_countAccount = 10;

    public Konto(String inhaber){
        // Konstruktor
        this.kontoInhaber = inhaber;
        this.kontoStand = 0.0;
        this.idNumber = s_countAccount++;
    }

    /*
    public void setInhaber(String kontoInhaber) {
        this.kontoInhaber = kontoInhaber;
        this.kontoStand = 0.0;
    }
     */

    public void aufbuchen(double betrag){
        this.kontoStand += betrag;
    }

    public void abbuchen(double betrag){
        if((this.kontoStand - betrag) >= 0){
            this.kontoStand -= betrag;
        }
        else{
            System.out.println("Betrag nicht verfügbar.");
        }
    }

    public void printKonto(){
        System.out.println("ID: " + this.idNumber);
        System.out.println("Inhaber: " + this.kontoInhaber);
        System.out.println("Kontostand: " + this.kontoStand);
    }

    // test for merge conflict
}

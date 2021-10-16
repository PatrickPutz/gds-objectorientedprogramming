import java.sql.SQLOutput;

public class Konto {

    private String kontoInhaber;
    private double kontoStand;

    public Konto(String inhaber){
        // Konstruktor
        this.kontoInhaber = inhaber;
        this.kontoStand = 0.0;
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
        System.out.println("Inhaber: " + this.kontoInhaber);
        System.out.println("Kontostand: " + this.kontoStand);
    }
}

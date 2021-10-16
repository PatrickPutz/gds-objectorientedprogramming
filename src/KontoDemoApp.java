public class KontoDemoApp {

    public static void main(String[] args) {

        Konto k001 = new Konto("Patrick Putz");

        Konto k002 = new Konto("Leo Tanner");

        Konto k003 = new Konto("Matthias Schober");

        k001.printKonto();
        k002.printKonto();
        k003.printKonto();

        k001.aufbuchen(25000);
        k001.abbuchen(12000);

        k002.abbuchen(10);
        k002.aufbuchen(20);
        k002.printKonto();
        k002.abbuchen(10);
        k002.printKonto();

        k003.aufbuchen(10);
        k003.abbuchen(20);
        k003.aufbuchen(10);
        k003.printKonto();

        k001.printKonto();
        k002.printKonto();
        k003.printKonto();


    }
}

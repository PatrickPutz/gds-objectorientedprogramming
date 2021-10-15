public class CarDemoApp {
    public static void main(String[] args) {

        int number = 7;
        String numberString = "Seven";

        Car golf5_G_876TU = new Car(); // damit wird ein Objekt von Car erstellt
        Car fiatPanda_G_123RU = new Car();

        golf5_G_876TU.manufacturer = "Volkswagen";
        golf5_G_876TU.model = "Golf V";
        golf5_G_876TU.horsePower = 90;
        golf5_G_876TU.colour = "black";
        golf5_G_876TU.co2Emission = 300;

        fiatPanda_G_123RU.manufacturer = "FIAT";
        fiatPanda_G_123RU.model = "Panda";
        fiatPanda_G_123RU.colour = "red";
        fiatPanda_G_123RU.horsePower = 75;
        fiatPanda_G_123RU.co2Emission = 120;

        Car golf5_LB_345LX;
        golf5_LB_345LX = new Car();
        golf5_LB_345LX.colour = "black";
        golf5_LB_345LX.model = "Golf V";

        System.out.println("Golf 5 aus Graz: " + golf5_G_876TU.co2Emission);
        System.out.println("Fiat: " + fiatPanda_G_123RU.model);
    }
}

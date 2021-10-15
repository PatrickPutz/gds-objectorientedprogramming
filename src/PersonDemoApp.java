public class PersonDemoApp {
    public static void main(String[] args) {
        Person Putzi = new Person();
        Putzi.firstname = "Patrick";
        Putzi.lastname = "Putz";
        Putzi.age = 24;
        Putzi.religion = "Fliegendes Spaghettimonster";

        Person Leo = new Person();
        Leo.firstname = "Leo";
        Leo.lastname = "Tanner";
        Leo.age = 22;
        Leo.religion = "Brieftaubenkult";

        Person Matthias = new Person();
        Matthias.firstname = "Matthias";
        Matthias.lastname = "Schober";
        Matthias.age = 36;
        Matthias.religion = "Bier";

        Putzi.memberAusgeben();
        Leo.memberAusgeben();
        Matthias.memberAusgeben();

        printPerson(Putzi);
        printPerson(Leo);
        printPerson(Matthias);
    }

    public static void printPerson(Person p){
        System.out.println(p.firstname + " " + p.lastname + ", " + p.age + ", " + p.religion);
    }
}

public class Person {

    public String firstname;
    public String lastname;
    public int age;
    public String religion;

    public void memberAusgeben(){
        // this liefert Referenz auf Attribut des Objekts (selber Variablenname könnte in Methode nochmal definiert werden)
        System.out.println(this.firstname + " " + this.lastname + ", " + this.age + ", " + this.religion);
    }
}
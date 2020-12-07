package Predavanje;

/**
 *  - Klase:
 *  - outer klasa - public i bez kljucne rijeci - paketno vidljiva
 *  - inner klasa
 * modifikatori vidljivosti
 *   - public - klasa svima dostupna
 *   - bez kljucne rijeci - paketno vidljiva, vidljiva unutar direktorija
 *
 *    Klasa moze imati :
 *    - polja(tj atribute, properties) - mogu biti static i non-static
 *    - konstruktor -
 *    - funkcije(tj metode) - mogu static i non static
 *
 */
public class Person {
    //polja objekta

    //static
    public static int counter = 0;

    //non static
    public String name;
    public String surname;
    public int age;

    //overloading po broju parametara
    public Person(){
        super();
        System.out.println("Kreira se objekat..");
        counter++;

    }

    public Person(String ime){ //ime stoji u garbage collector, parametar koji sluzi da ubaci
        name = ime;
        counter++;
    }
        //
    /*public Person (int age){
        this.age = age; //this moze jer je dinamicko. da je staticko moglo bi Person.age..
    }*/

    public Person (int age){
        this("", "", age); //pozivamo susjedni konstruktor
    }

    public Person (String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    //metode

    //non static

    //modifikator vidljivosti, povratni tip, ime funkcije

                //naziv funkcije je glagol
    public void speak(){
        String fullName = name + " " + surname;
        System.out.println(fullName + " zna kako da mnogo prica");;
    }

    public void speak(String nacinGovora){
        System.out.println(getFullName() + " prica " + nacinGovora);
    }

    public String getFullName(){
        String punoIme = name + ", " + surname;
        return punoIme;
    }

    public static void print(){
        System.out.println("Kreirano je " + counter + " objekata");
    }



}

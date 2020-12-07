package Predavanje;

public class Executor {
    public static void main(String[] args) {
        int number = 23;

        int[] numbers = new int[10]; //poziv konstruktora
        //mane niza su fiksna duzina i svi elementi niza moraju biti istog tipa
        Person.print();
        //
        Person boris = new Person(); // poziv konstruktora
        boris.name = "Borislav";
        boris.surname = "Domazet";
        boris.age = 32;
        System.out.println(Person.counter);

        Person vejsil = new Person();
        vejsil.name = "Vejsil";
        vejsil.surname = "Sarajlic";
        vejsil.age = 34;
        System.out.println(Person.counter);

        Person mujaga = new Person("Mujaga");
        System.out.println(Person.counter);

        Person albin = new Person(23);
        Person adna = new Person(24);
        Person melisa = new Person("Melisa", "Herovic", 19);

        melisa.speak();

        String melisaFullName = melisa.getFullName();
        System.out.println(melisaFullName);

        melisa.speak("tiho");

        Person.print();

    }
}

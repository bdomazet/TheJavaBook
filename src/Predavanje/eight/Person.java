package Predavanje.eight;

public class Person {

    private String name;
    private String surname;
    private int age;
    private Animal animal;



    public Person() {

        super();
        System.out.println("Poziva se konstruktor klase Person");

    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}

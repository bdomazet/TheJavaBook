package Predavanje.Seven;

public class Person {

    //posalja koja pripadaju objektu kreiranom po sablonu neke klase

    private String name;
    private String surname;
    private int age;

    private Gender gender; // relacija kompozicije

    private Animal animal;

    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        if (age>0) {
            this.age = age;
        }
    }



    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }


}

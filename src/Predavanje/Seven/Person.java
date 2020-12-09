package Predavanje.Seven;

public class Person {

    //posalja koja pripadaju objektu kreiranom po sablonu neke klase

    private String name;
    private String surname;
    private int age;

    private Gender gender; // relacija kompozicije

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

    public void setAge(int age) {
        if (age>0) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
}

package Predavanje.neki;

import java.time.LocalDate;
import java.util.Date;

public class Person {
    private int id;
    private String name;
    private String surname;
    private LocalDate birthday;

    public Person(int id, String name, String surname, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return id + ": " + name + " " + surname + ", birthday: " + birthday + ".";
    }
}

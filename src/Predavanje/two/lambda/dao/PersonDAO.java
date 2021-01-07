package Predavanje.two.lambda.dao;

import Predavanje.two.lambda.model.Gender;
import Predavanje.two.lambda.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO {

    List<Person> personList = new ArrayList<>();

    public List<Person> readPersonList() {
        personList.add(new Person("Borislav", "Domazet", Gender.MALE, LocalDate.of(1988, 5, 1)));
        personList.add(new Person("Almir", "Brkic", Gender.MALE, LocalDate.of(1991, 8, 18)));
        personList.add(new Person("Elma", "Djido", Gender.FEMALE, LocalDate.of(2000, 1, 1)));
        personList.add(new Person("Vejsil", "Sarajlic", Gender.MALE, LocalDate.of(1991, 7, 8)));
        personList.add(new Person("Melisa", "Herovic", Gender.FEMALE, LocalDate.of(1988, 5, 1)));
        personList.add(new Person("Nevena", "Pandurevic", Gender.FEMALE, LocalDate.of(1988, 5, 1)));
        personList.add(new Person("Harun", "Bucalovic", Gender.MALE, LocalDate.of(1988, 5, 1)));
        personList.add(new Person("Damir", "Fejzic", Gender.MALE, LocalDate.of(1988, 5, 1)));
        personList.add(new Person("Albin", "Fehric", Gender.MALE, LocalDate.of(1988, 5, 1)));
        personList.add(new Person("Adna", "Kuduzovic", Gender.FEMALE, LocalDate.of(1988, 5, 1)));
        personList.add(new Person("Emir", "Puska", Gender.UNKNOWN, LocalDate.of(1988, 8, 8)));
        return personList;
    }
}

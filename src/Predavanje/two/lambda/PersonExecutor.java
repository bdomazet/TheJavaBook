package Predavanje.two.lambda;

import Predavanje.two.lambda.dao.PersonDAO;
import Predavanje.two.lambda.model.Person;
import Predavanje.two.lambda.model.PersonChecker;

import java.util.List;
import java.util.function.Consumer;

public class PersonExecutor {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();
        List<Person> personList = personDAO.readPersonList();
        printPersons(personList);
        System.out.println();
        System.out.println("Enhanced");
        printEnhancedPersons(personList);
        System.out.println();
        System.out.println("Functional style");
        printFunctionalStyle(personList);


    }

    static void printPersons(List<Person> listaPersona) {
        for (int i = 0; i < listaPersona.size(); i++) {
            Person person = listaPersona.get(i);
            System.out.println(person);
        }
    }

    static void printEnhancedPersons(List<Person> listaPersona) {
        for (Person person : listaPersona) {
            System.out.println(person);
        }
    }

    static void printFunctionalStyle(List<Person> listaPersona) {
        Consumer<Person> consumer = (p) -> System.out.println(p);
        listaPersona.forEach(consumer);
    }
}
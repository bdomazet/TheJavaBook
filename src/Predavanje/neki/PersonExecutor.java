package Predavanje.neki;

import java.util.List;

public class PersonExecutor {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();
        List<Person> personList = personDAO.getPersonList();
        printEnhancedPersons(personList);
    }

    static void printEnhancedPersons(List<Person> listaPersona) {
        for (Person p : listaPersona) {
            System.out.println(p);
        }
    }


}

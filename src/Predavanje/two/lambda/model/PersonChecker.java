package Predavanje.two.lambda.model;

@FunctionalInterface

public interface PersonChecker {

    public abstract boolean checkPerson(Person person);

    default void printPerson(Person person){
        System.out.println(person);
    }

}

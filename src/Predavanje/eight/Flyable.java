package Predavanje.eight;

public interface Flyable {

    //ne moze imati polja koja su instancna, ne moze imati private, ime varijable caps lock
    //podrazuvjeva se public static final
    String NAME = "Letece zivotinje";

    //ne moze imati konstruktor

    //moze imati funkcije i skoro sve su apstraktne

    //public abstract se podrazumjeva
    void fly();

    public static void print(){

    }
}

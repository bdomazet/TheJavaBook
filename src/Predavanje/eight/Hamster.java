package Predavanje.eight;

public class Hamster extends Animal{

    public Hamster(String name){
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("Hrr hrr");
    }
}

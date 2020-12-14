package Predavanje.eight;

public class Bird extends Animal implements Flyable{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("Hu hu hu");
    }

    @Override
    public void fly() {
        System.out.println("Ptica leti");
    }
}

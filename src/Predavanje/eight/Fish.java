package Predavanje.eight;

public class Fish extends Animal{

    public Fish(String name){
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("Glu glu");
    }
}

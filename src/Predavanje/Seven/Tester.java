package Predavanje.Seven;

public class Tester {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Mujaga");
        student.setSurname("Hadzispahic");
        student.setAge(12);
        student.setIndexNumber("MH134444");
        Animal animal = new Cat("Tom");
        animal = new Dog("Felix");
        student.setAnimal(animal);
        Fish fish = new Fish("Ribica");
        student.setAnimal(fish);
    }
}

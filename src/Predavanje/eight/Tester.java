package Predavanje.eight;

public class Tester {
    public static void main(String[] args) {
        //Tip: Object, Person, Student - prvo se pozove super klasa, pa onda ona ispod
        Person personObject = new Student();
        //Tip: Object, Person, Profesor
        personObject = new Profesor();
        Student student2 = new Student();
        Dog dog = new Dog("Buddy");
        student2.setAnimal(dog);
        Cat cat = new Cat("Cicko");
        student2.setAnimal(cat);
        Hamster hamster = new Hamster("Hrle");
        student2.setAnimal(hamster);
        Fish fish = new Fish("Zlatna ribica");
        student2.setAnimal(fish);
        Bird bird = new Bird("Tweety");
        student2.setAnimal(bird);
        Plane plane = new Plane();
        Tester tester = new Tester();
        tester.executeFlying(bird);
        tester.executeFlying(plane);
        //flyable ->
        Flyable flyableObject = ()->{
            System.out.println("Leteci objekat");
        };
        flyableObject.fly();
        
        int number1 = 23;
        int number2 = 13;
        System.out.println("Nubmer1 je " + number1);
        System.out.println("Nubmer2 je " + number2);
        swap(number1, number2);
        System.out.println("Nubmer1 je " + number1);
        System.out.println("Nubmer2 je " + number2);


    }
        //java ne salje memorijsku lokaciju za proste tipove,
        //nego njigove vrijednosti. tako da do pravog swapa nece doci.
        //JAVA JE PASS BY VALUE ZA PROSTE TIPOVE
        //ALI JE PASS BY REFERENCE ZA SLOZENE TIPOVE
    static void swap(int nubmer1, int number2){
        System.out.println("Pocetak");
        int temp = nubmer1;
        nubmer1 = number2;
        number2 = temp;
        System.out.println("Nubmer1 je " + nubmer1);
        System.out.println("Nubmer2 je " + number2);
        System.out.println("Kraj");
        Person p1 = new Person();
        p1.setName("Boris");
        Person p2 = new Person();
        p2.setName("Mujaga");
        System.out.println(p1.getName());
        System.out.println(p2.getName());
        swapPerson(p1, p2);
        System.out.println(p1.getName());
        System.out.println(p2.getName());

    }

    static void swapPerson(Person p1, Person p2){
        String tempNameP1 = p1.getName();
        p1.setName(p2.getName());
        p2.setName(tempNameP1);


    }
    void executeFlying(Flyable flyable){
        System.out.println("Sada ce da poleti nas leteci ojekat");
        flyable.fly();
    }
}

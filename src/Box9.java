public class Box9 {
    private double width;
    private double height;
    private double depth;

    Box9(Box9 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box9(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box9() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box9(double cube) {
        cube = width = height = depth;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight3 extends Box9 {
    double weight;

    BoxWeight3(BoxWeight3 ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight3(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight3() {
        super();
        weight = -1;
    }

    BoxWeight3(double cube, double m) {
        super(cube);
        weight = m;
    }
}

class DemoSuper {
    public static void main(String[] args) {
        BoxWeight3 myBox1 = new BoxWeight3(10, 20, 15, 34.3);
        BoxWeight3 myBox2 = new BoxWeight3(2, 3, 4, 0.076);
        BoxWeight3 myBox3 = new BoxWeight3();
        BoxWeight3 myCube = new BoxWeight3(3, 2);
        BoxWeight3 myClone = new BoxWeight3(myBox1);
        double volume;


        volume = myBox1.volume();
        System.out.println("Volume of myBox1 " + volume);
        System.out.println("Weight of myBox1 " + myBox1.weight);
        System.out.println();

        volume = myBox2.volume();
        System.out.println("Volume of myBox1 " + volume);
        System.out.println("Weight of myBox1 " + myBox2.weight);
        System.out.println();

        volume = myBox3.volume();
        System.out.println("Volume of myBox1 " + volume);
        System.out.println("Weight of myBox1 " + myBox3.weight);
        System.out.println();

        volume = myClone.volume();
        System.out.println("Volume of myBox1 " + volume);
        System.out.println("Weight of myBox1 " + myClone.weight);
        System.out.println();

        volume = myCube.volume();
        System.out.println("Volume of myBox1 " + volume);
        System.out.println("Weight of myBox1 " + myCube.weight);
        System.out.println();


    }
}

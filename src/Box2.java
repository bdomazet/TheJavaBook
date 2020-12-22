public class Box2 {
    double width;
    double height;
    double depth;

    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box2() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box2(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class OverloadCons {
    public static void main(String[] args) {
        Box2 myBox1 = new Box2(10, 20, 15);
        Box2 myBox2 = new Box2();
        Box2 myCube = new Box2(7);

        double vol;

        vol = myBox1.volume();
        System.out.println("Volume of the myBox1 is: " + vol);

        vol = myBox2.volume();
        System.out.println("Volume of the myBox2 is: " + vol);

        vol = myCube.volume();
        System.out.println("Volume of the myCube is: " + vol);
    }
}

public class Box8 {

    double width;
    double height;
    double depth;

    Box8(Box3 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box8(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box8() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box8(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box8 {
    double weight;

    BoxWeight(double width, double height, double depth, double weight) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }
}


class DemoBoxWeight {
    public static void main(String[] args) {

        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;

        vol = myBox1.volume();
        System.out.println("Volume of myBox1: " + vol);
        System.out.println("Weight of myBox1: " + myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("Volume of myBox2: " + vol);
        System.out.println("Weight of myBox2: " + myBox2.weight);
        System.out.println();

    }
}
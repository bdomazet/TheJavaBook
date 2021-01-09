public class Box10 {
    private double width;
    private double height;
    private double depth;

    Box10(Box10 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box10(double width, double height, double depth) {
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    Box10() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box10(double cube) {
        cube = width = height = depth;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight4 extends Box10 {
    double weight;

    BoxWeight4(BoxWeight4 ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight4(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight4() {
        super();
        weight = -1;
    }

    BoxWeight4(double cube, double m) {
        super(cube);
        weight = m;
    }
}

class Shipment extends BoxWeight4 {
    double cost;

    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    Shipment() {
        super();
        cost = -1;
    }

    Shipment(double cube, double m, double c) {
        super(cube, m);
        cost = c;
    }

}

class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 076, 1.28);

        double vol;

        vol = shipment1.volume();
        System.out.println("Volume of shipment1 is: " + vol);
        System.out.println("Weight of shipment1 is: " + shipment1.weight);
        System.out.println("Cost of shipment1 is: " + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Volume of shipment1 is: " + vol);
        System.out.println("Weight of shipment1 is: " + shipment2.weight);
        System.out.println("Cost of shipment1 is: " + shipment2.cost);
        System.out.println();
    }
}

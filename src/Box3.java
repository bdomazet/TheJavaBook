public class Box3 {
    double width;
    double height;
    double depth;


    //object cloning constructor
    Box3(Box3 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //constructor with all three parameters known
    Box3(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    //no dimensions for this constructor
    Box3() {
        width = -1;
        height = -1;
        depth = -1;
    }

    //cube constructor
    Box3(double cube) {
        width = height = depth = cube;
    }

    //volume method
    double volume() {
        return width * height * depth;
    }
}

class OverloadCons2 {
    public static void main(String[] args) {
        Box3 myBox1 = new Box3(10, 20, 15);
        Box3 myBox2 = new Box3();
        Box3 myBox3 = new Box3(7);

        Box3 myClone = new Box3(myBox1);

        System.out.println("First box volume: " + myBox1.volume());

        System.out.println("Second vox volume: " + myBox2.volume());

        System.out.println("Third box volume: " + myBox3.volume());

        System.out.println("Clone box volume: " + myClone.volume());
    }
}

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
        Box8 plainBox = new Box8();
        double vol;

        vol = weightBox.volume();

        System.out.println("Volume of weightBox: " + vol);
        System.out.println("Weight of weightBox is: " + weightBox.weight);
        System.out.println();

        plainBox = weightBox;

        vol = plainBox.volume();

        System.out.println("Volume of weightBox: " + vol);
        //System.out.println("Weight of weightBox is: " + plainBox.weight);
        System.out.println();
    }
}

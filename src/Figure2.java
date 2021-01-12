abstract class Figure2 {
    double dim1;
    double dim2;

    Figure2(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract double area();
}

class Rectangle2 extends Figure2 {

    Rectangle2(double a, double b) {
        super(a, b);
    }

    @java.lang.Override
    double area() {
        System.out.println("Inside Area for Rectangle");
        return dim1 * dim2;
    }
}

class Triangl2 extends Figure2 {

    Triangl2(double a, double b) {
        super(a, b);
    }

    @java.lang.Override
    double area() {
        System.out.println("Inside Area for Triangle");
        return (dim1 * dim2) / 2;
    }
}

class AbstractArea {
    public static void main(String[] args) {
        Rectangle2 r = new Rectangle2(9, 2);
        Triangl2 t = new Triangl2(10, 8);
        Figure2 figref;

        figref = r;
        System.out.println("Area is: " + figref.area());

        figref = t;
        System.out.println("Area is: " + figref.area());
    }
}


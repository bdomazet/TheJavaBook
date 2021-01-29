public class MyExcepion extends Exception {
    private int detail;

    MyExcepion(int a) {
        detail = a;
    }

    @java.lang.Override
    public String toString() {
        return "MyExcepion{" + detail + "}";
    }
}

class ExceptionDemo {
    static void compute(int a) throws MyExcepion {
        System.out.println("Called compute{" + a + "}");
        if (a > 10) {
            throw new MyExcepion(a);
        }
        System.out.println("Normal exit");
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyExcepion e) {
            System.out.println("Caught " + e);
        }
    }
}
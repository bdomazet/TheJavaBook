public class StaticDemo {
    static int a = 42;
    static int b = 99;

    static void callMe() {
        System.out.println("a = " + a);
    }
}

class StaticByName {
    public static void main(String[] args) {
        StaticDemo.callMe();
        System.out.println("b = " + StaticDemo.b);
    }
}

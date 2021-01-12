public abstract class A7 {
    abstract void callMe();

    void callMeToo() {
        System.out.println("This is concrete method");
    }
}

class B7 extends A7 {

    @java.lang.Override
    void callMe() {
        System.out.println("B's implementation of callMe");
    }
}

class AbstractDemo {
    public static void main(String[] args) {
        B7 b = new B7();

        b.callMe();
        b.callMeToo();
    }
}

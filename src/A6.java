public class A6 {
    void callMe() {
        System.out.println("Inside A's callMe method");
    }
}

class B6 extends A6 {
    //override callMe from A6
    void callMe() {
        System.out.println("Inside B's callMe method");
    }
}

class C6 extends A6 {
    //override callMe from A6
    void callMe() {
        System.out.println("Inside C's callMe method");
    }
}

class Dispatch {
    public static void main(String[] args) {
        A6 a = new A6();
        B6 b = new B6();
        C6 c = new C6();
        A6 r;

        r = a;
        r.callMe();

        r = b;
        r.callMe();

        r = c;
        r.callMe();


    }
}
public class A3 {
    A3() {
        System.out.println("Inside A's constructor");
    }
}

class B3 extends A3 {
    B3() {
        System.out.println("Inside B's constructor");
    }
}

class C3 extends B3 {
    C3() {
        System.out.println("Inside C's constructor");
    }
}

class ExecuteConstructors {
    public static void main(String[] args) {
        C3 c3 = new C3();
    }
}

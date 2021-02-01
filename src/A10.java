public class A10 {
    synchronized void foo(B10 b) {
        String name = Thread.currentThread().getName();

        System.out.println(name + " entered A10.foo");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("A10 interrupted " + e);
        }

        System.out.println(name + " trying to call B.last()");
        b.last();
    }

    synchronized void last() {
        System.out.println("Inside A10.last");
    }
}

class B10 {
    synchronized void bar(A10 a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered B10.bar");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("B10 interrupted");
        }

        System.out.println(name + " trying to call A10.last()");
        a.last();
    }

    synchronized void last() {
        System.out.println("Inside B10.last");
    }
}

class Deadlock implements Runnable {
    A10 a = new A10();
    B10 b = new B10();
    Thread t;

    Deadlock() {
        Thread.currentThread().setName("Main thread");
        t = new Thread(this, "Racing thread");
    }

    void deadlockStart() {
        t.start();
        a.foo(b);
        System.out.println("Back in main thread");
    }

    @java.lang.Override
    public void run() {
        b.bar(a);
        System.out.println("Back in other thread");
    }

    public static void main(String[] args) {
        Deadlock dl = new Deadlock();

        dl.deadlockStart();
    }
}


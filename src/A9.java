public interface A9 {
    void meth1();

    void meth2();
}

//B now includes meth1 and meth2, and it adds meth3
interface B9 extends A9 {
    void meth3();
}

class MyClass2 implements B9 {

    @java.lang.Override
    public void meth1() {
        System.out.println("Implement meth1()");
    }

    @java.lang.Override
    public void meth2() {
        System.out.println("Implement meth2()");
    }

    @java.lang.Override
    public void meth3() {
        System.out.println("Implement meth3()");
    }
}


class IFExtend {
    public static void main(String[] args) {
        MyClass2 ob = new MyClass2();

        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}

public class A4 {

    int i;
    int j;

    A4(int a, int b) {
        i = a;
        j = b;
    }

    //display i and j
    void show() {
        System.out.println("i an j: " + i + " " + j);
    }
}

class B4 extends A4 {
    int k;

    B4(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        super.show();
        System.out.println("k: " + k);
    }
}

class ExecuteA4 {
    public static void main(String[] args) {
        B4 b4 = new B4(1, 2, 3);

        b4.show();
    }
}
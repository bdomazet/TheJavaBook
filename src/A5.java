public class A5 {
    int i;
    int j;

    A5(int i, int j) {
        this.i = i;
        this.j = j;
    }

    void show() {
        System.out.println("i and j " + i + " " + j);
    }
}

class B5 extends A5 {
    int k;

    B5(int a, int b, int k) {
        super(a, b);
        this.k = k;
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}


class Override {
    public static void main(String[] args) {
        B5 b5 = new B5(1, 2, 3);

        b5.show("This is k: ");
        b5.show();
    }
}
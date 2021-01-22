class A8 {
    public interface NestedIf{
        boolean isNotNegative(int x);
    }
}

class B8 implements A8.NestedIf{
    @java.lang.Override
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}

class NestedIfDemo{
    public static void main(String[] args) {
        A8.NestedIf nIf = new B8();

        if(nIf.isNotNegative(10)){
            System.out.println("10 is not negative");
        }

        if(nIf.isNotNegative(-12)){
            System.out.println("This won't be displayed");
        }
    }
}

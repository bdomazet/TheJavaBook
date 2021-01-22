public interface MyIf {
    //this is a "normal" interface method declaration
    //it does not define a default implementation
    int getNumber();

    //this is default method. provides a default implementation
    default String getString() {
        return "Default string";
    }

    //this is a static interface method
    static int getDefaultNumber() {
        return 0;
    }
}

class Primjer {
    public static void main(String[] args) {
        int a = MyIf.getDefaultNumber();
        System.out.println(a);
    }
}

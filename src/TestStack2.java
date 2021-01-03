public class TestStack2 {
    public static void main(String[] args) {
        Stack2 myStack1 = new Stack2();
        Stack2 myStack2 = new Stack2();

        for (int i = 0; i < 10; i++) {
            myStack1.push(i);
        }

        for (int j = 10; j < 20; j++) {
            myStack2.push(j);
        }

        System.out.println("Stack in myStack1: ");
        for (int i = 0; i < 10; i++) {
            myStack1.pop();
        }

        System.out.println("Stack in myStack2: ");
        for (int i = 0; i < 10; i++) {
            myStack2.pop();
        }
        

    }
}

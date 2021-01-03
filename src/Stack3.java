public class Stack3 {
    private int stck[];
    private int tos;

    Stack3(int size) {
        stck = new int[size];
        tos = -1;
    }

    void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Stack is full");
        } else {
            stck[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            return stck[tos--];
        }

    }
}

class TestStack3 {
    public static void main(String[] args) {
        Stack3 myStack1 = new Stack3(5);
        Stack3 myStack2 = new Stack3(8);

        for (int i = 0; i < 5; i++) {
            myStack1.push(i);
        }

        for (int i = 0; i < 8; i++) {
            myStack2.push(i);
        }

        System.out.println("Stack in myStack1");
        for (int i = 0; i < 5; i++) {
            System.out.println(myStack1.pop());
        }

        System.out.println("Stack in myStack2");
        for (int i = 0; i < 8; i++) {
            System.out.println(myStack2.pop());
        }
    }
}
public interface IntStack {
    void push(int item); //store an item

    int pop(); // retrieve an item
}

//An implementation of IntStack that uses fixed storage
class FixedStack implements IntStack {
    private int stck[];
    private int tos;

    //allocate and initialize stack
    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    //Push an item onto the stack
    public void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Stack is full");
        } else {
            stck[++tos] = item;
        }
    }

    //Pop an item from the stack
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            return stck[tos --];
        }
    }
}

class IfTest {
    public static void main(String[] args) {
        FixedStack myStack1 = new FixedStack(5);
        FixedStack myStack2 = new FixedStack(8);

        //Push some numbers onto the stack
        for (int i = 0; i < 5; i++) {
            myStack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            myStack2.push(i);
        }

        //Pop some numbers off the stack
        System.out.println("myStack1");
        for (int i = 0; i < 5; i++) {
            System.out.println(myStack1.pop());
        }
        System.out.println();
        System.out.println("myStack2");
        for (int i = 0; i < 8; i++) {
            System.out.println(myStack2.pop());
        }

    }
}

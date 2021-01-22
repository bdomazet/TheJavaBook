public class DynClass implements IntStack {
    private int stck[];
    private int tos;

    //allocate and initialize stack
    DynClass(int size) {
        stck = new int[size];
        tos = -1;
    }

    //push an item onto the stack, expand stck[]
    public void push(int item) {
        //if stack is full, allocate a larger stack
        if (tos == stck.length - 1) {
            int temp[] = new int[stck.length * 2];
            for (int i = 0; i < stck.length; i++) {
                temp[i] = stck[i];
            }
            stck = temp;
            stck[++tos] = item;
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
            return stck[tos--];
        }
    }
}

class IfTest2 {
    public static void main(String[] args) {
        DynClass myStack1 = new DynClass(5);
        DynClass myStack2 = new DynClass(8);

        //Push some numbers onto the stack
        for (int i = 0; i < 12; i++) {
            myStack1.push(i);
        }
        for (int i = 0; i < 20; i++) {
            myStack2.push(i);
        }

        //Pop some numbers off the stack
        System.out.println("myStack1");
        for (int i = 0; i < 12; i++) {
            System.out.println(myStack1.pop());
        }
        System.out.println();
        System.out.println("myStack2");
        for (int i = 0; i < 20; i++) {
            System.out.println(myStack2.pop());
        }

    }
}



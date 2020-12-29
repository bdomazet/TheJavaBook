public class Test {
    int a;
    int b;

    Test(int a, int b){
        this.a = a;
        this.b = b;
    }

    boolean equalTo(Test o){
        //return o.a == this.a && o.b == this.b;
        if(a == o.a && b == o.b){
            return true;
        }else{
            return false;
        }
    }
}

class PassOb{
    public static void main(String[] args) {
        Test ob1 = new Test(100,200);
        Test ob2 = new Test(100,200);
        Test ob3 = new Test(-1,-4);

        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));
    }
}

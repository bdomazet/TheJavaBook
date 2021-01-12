package MyPack;

public class Balance{
    String name;
    double bal;


    public Balance (String a, double b){
        name = a;
        bal = b;
    }


    public void show(){
        if(bal<0){
            System.out.println("--> ");
        }else {
            System.out.println(name + ": $" + bal);
        }
    }
}
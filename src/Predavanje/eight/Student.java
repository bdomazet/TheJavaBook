package Predavanje.eight;

public class Student extends Person{
    private String indexNumber;

    public Student(){
        super();
        System.out.println("Poziva se konstruktor klase Student");
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }
}

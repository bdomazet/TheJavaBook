package Predavanje.Seven;

public class Student extends Person{
    private String indexNumber;

    public Student(){
        super();
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        if (indexNumber.length()>5 && indexNumber.length()<10) {
            this.indexNumber = indexNumber;
        }
    }

    @Override
    public void setAge(int age) {
        if(age>=18) {
            setAge(age);
        }
    }
}

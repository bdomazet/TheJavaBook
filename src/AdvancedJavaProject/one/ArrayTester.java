package AdvancedJavaProject.one;

public class ArrayTester {
    public static void main(String[] args) {
        DynamicalArrayWriter arrayWriter = new DynamicalArrayWriter();
        arrayWriter.writeListIntoFile();
        arrayWriter.readFile();
    }
}

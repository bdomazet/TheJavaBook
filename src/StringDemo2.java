public class StringDemo2 {
    public static void main(String[] args) {
        String strOb1 = "First string";
        String strOb2 = "Second string";
        String strOb3 = strOb1 + " and " + strOb2;

        System.out.println("Length of strOb1: " + strOb1.length());

        System.out.println("Char at index 3 in strOb1: " + strOb1.charAt(3));

        if (strOb1.equals(strOb2)) {
            System.out.println("strOb1 equals strOb2");
        } else {
            System.out.println("strOb1 != stOb2");
        }

        if (strOb1.equals(strOb3)) {
            System.out.println("strOb1 equals strOb3");
        } else {
            System.out.println("strOb1 != stOb3");
        }

    }
}

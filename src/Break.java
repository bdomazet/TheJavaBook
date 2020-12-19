public class Break {
    public static void main(String[] args) {
        boolean t = true;


        first:
        {
            second:
            {
                third:
                {
                    System.out.println("This is before the break");
                    if (t) {
                        break second;
                    }
                    System.out.println("This will not execute");
                }
                System.out.println("This will not execute");
            }
            System.out.println("This will execute");
        }
    }
}

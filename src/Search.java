public class Search {
    public static void main(String[] args) {
        int numbers[] = {6, 8, 3, 7, 5, 6, 1, 4};

        int val = 6;

        boolean found = false;

        for (int x : numbers) {
            if (val == x) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Value found");
        }
    }
}

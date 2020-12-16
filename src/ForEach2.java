public class ForEach2 {
    public static void main(String[] args) {
        int nums[] = {5, 4, 3, 2, 1, 0};
        int sum = 0;

        for (int x : nums) {
            sum += x;
            if (x == 5) {
                break;
            }
        }
        System.out.println("Sum is: " + sum);
    }
}

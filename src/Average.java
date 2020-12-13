public class Average {
    public static void main(String[] args) {
        double nums[] = {10.1,11.2,12.3,13.4,14.5};
        double result = 0;

        System.out.println(nums.length);

        for (int i=0; i<nums.length; i++ ){
            result = nums[i] + result;
        }
        System.out.println("Result is:" + result/(nums.length));
    }
}

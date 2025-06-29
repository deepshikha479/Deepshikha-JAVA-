public class MinMax {
    public static void main(String[] args) {
        int[] nums = {10, 25, 3, 89, 5};
        int min = nums[0], max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}

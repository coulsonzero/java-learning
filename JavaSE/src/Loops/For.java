package Loops;

public class For {
    public static void main(String[] args) {
        for_string();
        for_array();
    }

    public static void for_string() {
        String s = "hello";
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }

    public static void for_array() {
        int[] nums = {3, 6, 1, 7};
        for (int num : nums) {
            System.out.println(num);
        }

        // for (int i = 0; i < nums.length; i++) {
        //    System.out.println(nums[i]);
        // }
    }
}

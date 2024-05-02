package Collection.Array;

import java.util.Arrays;

/**
 * CoreType.Array Api:
 * 输出：Arrays.toString(nums)
 * 长度：nums.length
 * 值：nums[i]
 * 原地排序：Arrays.sort(nums)
 * 转为List：Arrays.asList()
 */

public class arrayDemo {
    public static void main(String[] args) {
        arrayDemo2();
    }

    public static void arrayDemo1() {
        int[] nums = {2, 7, 3, 1, 5};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void arrayDemo2() {
        int[] arr = new int[4]; // 有默认值
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

package easy;

import java.util.Arrays;

/**
 * 给定一个整数数组 nums 和一个目标值target ，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * 示例:
 * 给定 nums = [2, 7, 11,15], target= 9
 * 因为 nums[0]+ nums[1] = 2 + 7 = 9 所以返回 [0, 1]
 *
 * @author Vangelis
 * @date 2019-07-18 11:04
 */

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }

    /**
     *  双重循环
     时间复杂度：O(n^2)O(n
     对于每个元素，我们试图通过遍历数组的其余部分来寻找它所对应的目标元素，这将耗费 O(n)O(n) 的时间。因此时间复杂度为 O(n^2)O(n
     空间复杂度：O(1)O(1)。
     */
    private static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j]==target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("没有这两个数");
    }
}

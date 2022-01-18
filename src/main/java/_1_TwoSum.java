import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * <p>
 * 你可以按任意顺序返回答案。
 *
 * @author : zhangzy
 * @date : 2022/1/18
 */
public class _1_TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{12, 3, 5, 33, 2};
        int[] res = twoSum(nums, 5);
        System.out.println("idx:" + res[0] + "," + res[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[]{-1, -1};
        if (nums == null || nums.length < 2) {
            return res;
        }
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                res[0] = i;
                res[1] = map.get(target - nums[i]);
                break;
            }
            System.out.println(nums[i]);
            map.put(nums[i], i);
        }
        return res;
    }
}

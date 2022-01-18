import java.util.HashMap;
import java.util.Map;

/**
 * description
 *
 * @author : zhangzy
 * @date : 2022/1/18
 */
public class _1TwoSum {
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

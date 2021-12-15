package zheng;

import java.util.HashMap;
import java.util.Map;

public class Question3 {

    public static int subarray(int[] nums, int k) {
        int count = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (map.containsKey(sum - k)) {
                count = count + map.get(sum - k);
            }

            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int [] nums = {1,1,1};
        int k = 2;
        System.out.println(subarray(nums , k));
    }
}

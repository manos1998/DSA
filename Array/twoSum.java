// class -> returntype function -> 

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if(map.containsKey(compliment)) {
                return new int[] {map.get(compliment), i};
            }
            map.put(nums[i], i);
        }

        return new int[] {};
    }
}

public class twoSum {
    public static void main(String args[]) {
        Solution sol = new Solution();
        int[] values = {2,7,5,11};
        int target = 9;
        int[] result = sol.twoSum(values, target);
        System.out.println(Arrays.toString(result));
    }
}

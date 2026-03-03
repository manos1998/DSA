
import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seenNumbers = new HashSet<>();
        
        for(int num: nums) {
            if(seenNumbers.contains(num)) {
                System.out.println("seenNumbers" + seenNumbers + "match number" + num);
                return true;
            }
            seenNumbers.add(num);
        }
        return false;
    }
}

public class constainsDuplicate {
    public static void main(String args[]) {
        Solution sol = new Solution();
        int[] nums = {1,2,3,4,1};
        boolean result = sol.containsDuplicate(nums);
        System.out.println(result);
        System.out.println("Happy");
    }
    
}

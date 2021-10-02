import java.util.HashMap;

//https://leetcode.com/problems/contains-duplicate-ii/

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> entries = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++) {
            if (entries.containsKey(nums[i])) {
                int previousindex = entries.get(nums[i]);
                if (i-previousindex <= k)
                    return true;
            }
            entries.put(nums[i], i);
        }
        return false;
    }
}

import java.util.HashMap;

// https://leetcode.com/problems/contains-duplicate/

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> entries = new HashMap<Integer, Boolean>();
        for(int num: nums) {
            
            if(entries.containsKey(num)) {
                return true;
            }
            entries.put(num, true);
        }
        return false;
    }
}

import java.util.TreeSet;

//https://leetcode.com/problems/contains-duplicate-iii/

public class ContainsDuplicateIII {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k<1 || t < 0) {
            return false;
        }
        TreeSet<Long> seen = new TreeSet<Long>();
        for(int i=0;i<nums.length;i++) {
            Long val = seen.floor((long)nums[i]);
            if(val!=null && Math.abs(nums[i]-val) <= t){
                return true;
            }
            val = seen.ceiling((long)nums[i]);
            if(val!=null && Math.abs(nums[i]-val) <= t){
                return true;
            }
            if (i >= k) {
			    seen.remove((long)nums[i - k]);
            }
            seen.add((long)nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicateIII containsDuplicateIII = new ContainsDuplicateIII();
        System.out.println(containsDuplicateIII.containsNearbyAlmostDuplicate(new int[]{1,0,1,1}, 1, 2));
    }

}

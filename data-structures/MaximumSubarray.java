/**
 * Leet Code: https://leetcode.com/problems/maximum-subarray/
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int bestsum = Integer.MIN_VALUE;
        int currentsum = 0;
        for(int i=0;i<nums.length;i++){
            currentsum = Math.max(nums[i],currentsum+nums[i]);
            bestsum = Math.max(currentsum,bestsum);
        }
        return bestsum;
    }

    public static void main(String[] args) {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        System.out.println(maximumSubarray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}

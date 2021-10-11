package interviewcamp;

public class ReverseArray {
    
    public static int[] reverseArray(int[] nums) {
        if(nums == null || nums.length <= 1) {
            return nums;
        }
        int start = 0, end = nums.length -1;
        while( start < end ) {
            swap(nums, start++, end--);
        }
        return nums;
    }

    private static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    
    public static void main(String[] args) {
        System.out.println(reverseArray(new int[]{1}));
        System.out.println(reverseArray(new int[]{}));
        System.out.println(reverseArray(null));
        System.out.println(reverseArray(new int[]{1,2}));
        System.out.println(reverseArray(new int[]{1,9,0,32,4,52,13}));
    }
}

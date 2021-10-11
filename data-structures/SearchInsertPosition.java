public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        return  searchInsertUtility(nums, 0, nums.length, target);
    }

    private int searchInsertUtility(int[] nums, int start, int end, int target) {
        if(start == end - 1) {
            if(nums[start] >= target) {
                return start;
            } else {
                return end;
            }
        }
        int mid = (end+start)/2;
        if (target> nums[mid]) {
            return searchInsertUtility(nums, mid, end, target);
        } else if (target<nums[mid]){
            return searchInsertUtility(nums, start, mid, target);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        System.out.println(searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 2));
    }
}



// for(i=0;i<nums.length;i++) {
//     if(nums[i] >= target) {
//         return i;
//     }
// }
// return i;
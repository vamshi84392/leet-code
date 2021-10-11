public class MedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if ((nums1 == null || nums1.length == 0) && (nums2 == null || nums2.length == 0)) {
            return 0;
        } else if (nums1 == null || nums1.length == 0) {
            return getMedian(nums2);
        } else if (nums2 == null || nums2.length == 0){
            return getMedian(nums1);
        }
        int i=0, j=0, k=0;
        int totalLength = nums1.length + nums2.length;
        int[] resultedArray = new int[totalLength];
        while(i<nums1.length && j< nums2.length) {
            if(nums1[i]<nums2[j]) {
                resultedArray[k++] = nums1[i++];
            } else {
                resultedArray[k++] = nums2[j++];
            }
        }
        while(i<nums1.length) {
            resultedArray[k++] = nums1[i++];
        }
        while(j<nums2.length) {
            resultedArray[k++] = nums2[j++];
        }
        return getMedian(resultedArray);
    }
    
    private double getMedian(int[] nums) {
        int result = nums[nums.length/2];
        if(nums.length%2==0) {
            result += nums[nums.length/2-1];
            return  result/(double)2;
        }
        return result;
    }
}

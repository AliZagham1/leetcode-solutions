package two_pointer.Subset;

public class Solution {
    public static int subsets(int[] nums1, int[] nums2) {
        int i =0;
        int j = 0;
        while (i < nums1.length && j < nums2.length){
            if (nums1[i] == nums2[j]){
                i++;
                j++;

            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                return 0;
            }
        }

         return (i == nums1.length) ? 1: 0;
        
    }
    
}

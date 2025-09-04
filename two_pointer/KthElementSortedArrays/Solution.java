package two_pointer.KthElementSortedArrays;

public class Solution {
    public int kthElement(int[] array1, int[] array2, int k){
        int i = 0, j = 0, index = 0;
        int[] combined = new int[array1.length + array2.length];
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                combined[index++] = array1[i++];
            } else {
                combined[index++] = array2[j++];
            }
        }
        while (i < array1.length) {
            combined[index++] = array1[i++];
        }
        while (j < array2.length) {
            combined[index++] = array2[j++];
        }
        return combined[k - 1];
    }
    
}

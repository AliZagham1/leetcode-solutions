package two_pointer.findZeroes;

public class Solution {
    public static int findZeroes(int[] array){
        int low = 0;
        int high = array.length - 1;
        int m = 0; // for finding zeroes
        
        while (low <= high ) { 
            int mid = (low + high) / 2;
            if (array[mid] == 0) {
                m = mid + 1;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return m;
    }

    
}

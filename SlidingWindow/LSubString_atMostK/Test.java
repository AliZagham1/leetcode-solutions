package SlidingWindow.LSubString_atMostK;

public class Test {
    public static void main(String[] args) {
        Solution sol = new Solution();
        // Test cases
        System.out.println(sol.lengthOfLongestSubstringKDistinct("eceba", 2)); // Expected 3
        System.out.println(sol.lengthOfLongestSubstringKDistinct("aa", 1));    // Expected 2
        System.out.println(sol.lengthOfLongestSubstringKDistinct("aabbcc", 2)); // Expected 4
        System.out.println(sol.lengthOfLongestSubstringKDistinct("abcadcacacaca", 3)); // Expected 11


    }

    
}

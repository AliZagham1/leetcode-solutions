package Arrays_Hashing.GroupAnagrams;

public class Test {
    public static void main(String[] args) {
        Solution sol = new Solution(); // 
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"}; // Test array
        System.out.println(sol.groupAnagrams(strs)); // Expected: [[eat, tea, ate], [tan, nat], [bat]]
    }
    
}

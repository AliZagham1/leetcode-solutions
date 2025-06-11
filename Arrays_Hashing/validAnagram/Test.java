package Arrays_Hashing.validAnagram;

public class Test {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.validAnagram("racecar", "carrace")); // True
        System.out.println(sol.validAnagram("jar", "jam")); // False

    }
}
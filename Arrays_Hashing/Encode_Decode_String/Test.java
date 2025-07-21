package Arrays_Hashing.Encode_Decode_String;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String encoded = (sol.encode(strs)); 
        System.out.println(encoded); // Expected: "3#eat3#tea3#tan3#ate3#nat3#bat"
        List<String> result = sol.Decode(encoded);
        System.out.println(result); // Expected: ["eat", "tea", "tan", "ate", "nat", "bat"]
    }
    
}

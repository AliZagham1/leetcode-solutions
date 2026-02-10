# Maximum Occurring Character in a String 

# Description

This problem finds the character that appears the most frequently in a given string.
If multiple characters have the same maximum frequency, the character that appears first in the string is returned.

The solution is case-sensitive and works for any characters present in the input string.

# Core Concept

- The key idea is frequency counting.

- Traverse the string character by character

- Use a HashMap<Character, Integer> to store how many times each character appears

- Track the current maximum frequency

- Update the result only when a strictly higher frequency is found, which automatically preserves the “first occurrence wins” rule in case of ties

- This allows the answer to be computed in a single pass.

# Why This Approach Works

- HashMaps provide constant-time lookup and updates

- Updating the result only when count > max ensures:

- Correct maximum frequency

- Correct tie-breaking (first occurrence)

- No sorting or extra passes are required

- This pattern is very common in string-processing and interview problems.

# Example

Input: programming

Output : r

# Explanation:
r, g, and m appear twice, but r appears first.

# Edge Cases Considered

- Strings with all unique characters

- Strings with multiple maximum-frequency characters

- Mixed letters, digits, or symbols

- Assumes input string is non-empty

# Complexity

Time Complexity: O(n)

Space Complexity: O(k)
where k is the number of distinct characters (bounded by character set size)
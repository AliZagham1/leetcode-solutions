LeetCode 271: Encode and Decode Strings
# Problem Description
Design an algorithm to encode a list of strings to a single string and decode the single string back to a list of strings.
The encoded string is guaranteed to be decodable.
The original list of strings can contain any characters (including the delimiter you use).

# Example
Input:
["leet", "code", "love", "you"]
Encoding Output:
"4#leet4#code4#love3#you"
Decoding Output:
["leet", "code", "love", "you"]

# Approach
For encoding, append the length of each string, a special delimiter (such as #), and the string itself. Concatenate all such segments together to form the encoded string.

For decoding, iterate through the encoded string to parse out each length and extract the corresponding substring using that length, repeating until the end of the string is reached.

This method avoids delimiter collisions and preserves the original list structure for any possible string values.


# Time Complexity:

Encoding: O(N), where N is the total number of characters in all strings.

Decoding: O(N), as each character in the encoded string is processed once.

# Space Complexity:

Encoding: O(1) extra space (output string not counted).

Decoding: O(N) for the output list of strings.


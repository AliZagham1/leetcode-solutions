# Leetcode 125:  Valid Palindrome

# Problem Description

A palindrome is a word, phrase, or sequence that reads the same backward as forward.
Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

--

# Example
Input:
"A man, a plan, a canal: Panama"
Output:
true
Explanation:
After removing non-alphanumeric characters and converting to lowercase, the string becomes "amanaplanacanalpanama", which is a palindrome.

Input:
"race a car"
Output:
false
Explanation:
The processed string "raceacar" is not a palindrome.

Input:
"0P"
Output:
false
Explanation:
The processed string "0p" is not a palindrome.

--

Constraints:

1 <= s.length <= 2 * 10^5

s consists only of printable ASCII characters

--

Notes
Time Complexity: O(n)

Space Complexity: O(n) (for the cleaned string)

Handles both letters and digits.

Non-alphanumeric characters are ignored.

Case is ignored for palindrome checking.





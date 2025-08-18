LeetCode 824 – Goat Latin
# Problem Description

You are given a sentence sentence consisting of words separated by spaces.
Convert the sentence to Goat Latin using these rules:

If a word begins with a vowel (a, e, i, o, u, case insensitive), append "ma" to the end.

If a word begins with a consonant, remove the first letter, append it to the end, and then add "ma".

Add one letter "a" to the end of each word per its index in the sentence (1-based).

1st word → "a"

2nd word → "aa"

3rd word → "aaa", etc.

Return the final Goat Latin sentence.

# Example

Input:

"I speak Goat Latin"


Output:

"Imaa peaksmaaa oatGmaaaa atinLmaaaaa"


# Explanation:

"I" → starts with vowel → "Ima" → add "a" → "Imaa"

"speak" → consonant → "peaksma" → add "aa" → "peaksmaaa"

"Goat" → consonant → "oatGma" → add "aaa" → "oatGmaaaa"

"Latin" → consonant → "atinLma" → add "aaaa" → "atinLmaaaaa"

# Approach

Split the sentence into words by spaces.

For each word:

Check if the first character is a vowel or consonant.

Apply transformation rules (append "ma", move first char if needed).

Add 'a' repeated (word index + 1) times.

Join the transformed words with spaces and return the result.

# Complexity

Time: O(n), where n is the number of characters in the sentence.

Space: O(n) for the output string.
Reverse Bits (LeetCode #190)
# Problem Description
Given a 32-bit unsigned integer, reverse its bits and return the resulting unsigned integer.

For example, if the input binary representation is:

00000010100101000001111010011100
The reversed bits would be:
00111001011110000010100101000000
and the function should return the decimal equivalent of this reversed binary number.

# Example
Input: n = 00000010100101000001111010011100 (binary)
Output: 964176192 (decimal)
Explanation: The reversed binary corresponds to decimal 964176192.

# Approach
Initialize an integer variable reversed to 0. This will hold the reversed bits.

Iterate over all 32 bits of the input number:

Extract the least significant bit (rightmost) of n using bit = n & 1.

Shift reversed left by 1 bit to make room for the new bit.

Use bitwise OR to add the extracted bit to reversed: reversed = (reversed << 1) | bit.

Unsigned right shift the input number n by 1 bit: n >>>= 1.

After processing all bits, reversed contains the reversed bit representation of n.

# Time Complexity
The algorithm iterates over all 32 bits once, so the time complexity is O(1) (constant time), since the number of bits is fixed.

# Space Complexity
Uses a constant amount of extra space for variables, so the space complexity is O(1).
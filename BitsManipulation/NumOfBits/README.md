 
 Leetcode #191 Number of One Bits (Hamming Weight)
# Problem Description
Given an unsigned 32-bit integer n, return the number of '1' bits it has (also known as the Hamming weight).

Note:
The input integer n is guaranteed to fit within 32 bits.
The integer is unsigned (non-negative).

# Example
Input: n = 11
Binary representation: 00000000000000000000000000001011
Output: 3
Explanation: The binary representation contains three '1' bits.

# Approach
Initialize a counter to zero.

Iterate through each of the 32 bits of the integer:

Use bitwise AND n & 1 to check if the least significant bit is 1.

Add the result (0 or 1) to the counter.

Right shift the integer by 1 bit using an unsigned right shift to move to the next bit.

Return the total count of '1' bits after processing all bits.

This method runs in O(1) time since the number of bits is fixed (32 bits).


# Time Complexity
O(1), since the number of bits to check is fixed at 32.

# Space Complexity
O(1), using only a few integer variables.
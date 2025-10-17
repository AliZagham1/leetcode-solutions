LeetCode 121 — Best Time to Buy and Sell Stock
# 🧩 Problem Description

You are given an array prices[] where prices[i] represents the price of a given stock on the iᵗʰ day.

You want to maximize your profit by choosing a single day to buy one stock and a different day in the future to sell it.

Return the maximum profit you can achieve.
If no profit is possible, return 0.

# 🧠 Example
Example 1

Input:
prices = [7, 1, 5, 3, 6, 4]

Output:
5


Explanation:
Buy on day 2 (price = 1) and sell on day 5 (price = 6).
Profit = 6 − 1 = 5.

# Example 2

Input:
prices = [7, 6, 4, 3, 1]

Output:
0


Explanation:
Prices decrease every day, so no profit can be made.

# 🚀 Approach
✅ Optimal (O(n)) Solution

Initialize two variables:

minPrice → the lowest price so far (best day to buy).

maxProfit → the highest profit seen so far.

Loop through the array:

Update minPrice whenever a smaller price is found.

Calculate profit = price − minPrice.

Update maxProfit if this profit is higher than the previous one.

Return maxProfit after scanning all prices.

# 🕒 Complexity

Time Complexity: O(n) — single pass through prices

Space Complexity: O(1) — only two variables used
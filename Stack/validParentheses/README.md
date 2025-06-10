# LeetCode 20. Valid Parentheses

## Problem Description

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is **valid**.

A string is valid if:
1. Open brackets are closed by the same type of brackets.
2. Open brackets are closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.

## Example Test Cases

Below are the test cases used in the `Test.java` file:

| Input       | Output  |
|-------------|---------|
| "()"        | true    |
| "()[]{}"    | true    |
| "(]"        | false   |
| "([)]"      | false   |
| "{[]}"      | true    |

--
## Input
   s: A string containing only characters '(', ')', '{', '}', '[' and ']'

--

# Output

Returns true if the input string is valid, otherwise false.

--

## Time Complexity

O(n), where n is the length of the string (each character is pushed/popped from the stack once).

--

# Space Complexity

O(n), stack may hold all opening brackets in the worst case.

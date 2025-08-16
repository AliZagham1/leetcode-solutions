# Min Stack 

LeetCode: 155
Topic: Stack, Design
Goal: Design a stack supporting push, pop, top, and getMin in O(1) time per operation.

# Problem summary

Build a stack-like data structure:

MinStack() initializes the object

push(val) pushes val onto the stack

pop() removes the top element

top() returns the top element

getMin() returns the current minimum element
All operations must be O(1).

Key idea

Maintain two stacks:

main stack: stores all values

min stack: stores the running minimums

# Rules

on push(val): push to main; also push to min if min is empty or val <= current min

on pop(): pop from main; if popped value equals min.peek, pop from min

top(): main.peek

getMin(): min.peek

Why it works

min stack mirrors only the points where a new minimum appears

when that minimum leaves (via pop), the previous minimum is revealed at the top of min stack

# Complexity

time: O(1) for all operations

space: O(n) in worst case (strictly decreasing pushes make min stack size n)

# Edge cases and safeguards

empty structure: top/getMin/pop on empty is undefined; LeetCode input avoids this, but in production you’d guard or throw

duplicates of the minimum: push duplicates to min stack too; pop removes one copy at a time, keeping previous min correct

first push: min stack is empty → treat the first value as the minimum

# Dry-run snapshot

push 5 → main [5], min [5]
push 3 → main [5,3], min [5,3]
push 3 → main [5,3,3], min [5,3,3]
push 4 → main [5,3,3,4], min [5,3,3]
getMin → 3
pop (4) → main [5,3,3], min [5,3,3]
pop (3) → main [5,3], min [5,3]
getMin → 3
pop (3) → main [5], min [5]
getMin → 5

# Common pitfalls

forgetting the empty check before comparing to min.peek on first push

using < instead of <= for push-to-min (breaks duplicate-min handling)

popping only from main stack (min stack becomes out of sync)
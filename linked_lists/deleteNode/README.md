# 🧩 LeetCode 237 – Delete Node in a Linked List

# 📌 Problem

You are given access to a node in a singly linked list that needs to be deleted.

You are not given the head of the list.

It is guaranteed that the node to be deleted is not the last node.

Delete the given node in-place.

# 📝 Example

Input:
4 → 5 → 1 → 9

Delete node with value 5

Output:
4 → 1 → 9

# 💡 Approach

Since we do not have access to the head or the previous node, we cannot perform normal deletion.

Instead:

Copy the value of the next node into the current node.

Update the current node’s next pointer to skip the next node.

This effectively removes the target node from the list.

# ⏱ Time Complexity
O(1)

# 📦 Space Complexity
O(1)
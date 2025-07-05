# 📄 LeetCode 105: Construct Binary Tree from Preorder and Inorder Traversal
# 📝 Description
- You are given two integer arrays:

- preorder: the preorder traversal of a binary tree

- inorder: the inorder traversal of the same binary tree

- Both arrays are of the same length and consist of unique values.

- Your task is to rebuild the binary tree and return its root node.

# 🚩 Approach
1️⃣ Use the property of preorder traversal:
The first element of preorder is always the root of the current subtree.

2️⃣ Use the property of inorder traversal:
The index of the root in inorder splits the tree into left and right subtrees:

Elements to the left of the root’s index belong to the left subtree.

Elements to the right of the root’s index belong to the right subtree.

3️⃣ Recursively construct:

Take the next element in preorder as root.

Split inorder into left and right parts.

Determine the corresponding parts of preorder based on the size of left subtree.

Recursively build left and right subtrees.

This can be implemented using either an index-based approach (optimal) or an array slicing approach (simpler but less efficient).

# 🖼️ Example

[Build Tree](./example.png)

⏳ Time and Space Complexity

- Time		O(n²)
- Space		O(n²) (due to array copies & recursion)

✅ Where n is the number of nodes.
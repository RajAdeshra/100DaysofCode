Day 54 of my 100 Days of Code
### TOPIC: 
Maximum Depth of Binary Tree
### QUESTION: 
Given the root of a binary tree, return its maximum depth. 
A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

EXAMPLE
Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 3

Example 2:
Input: root = [1,null,2]
Output: 2

### TESTCASES:

Case1:
  3
 / \
9   20
   /  \     
  15   7
Output: 3
Explanation:  There are two possible longest path as shown in tree.

CASE 2:
Input: Empty Tree
Output: 0
Explanation: As the tree is empty, depth is 0.

CASE 3:
Input: 0
Output:1
Explanation:As there are only one node, depth is 1.

### EXPLANATION:
To find the maximum depth of the tree we can apply a simple recursive approach. 
Where each function call will represent a subtree which has root node called as ‘root’. 
We traverse the tree by a recursive function starting from the root node.
So the base case is when the subtree is empty i.e. root is NULL. So we return depth as 0.
if root is not NULL, call the same function recursively for its left child and right child.
As shown in figure, when the two child function return its depth we pick the maximum out of these two subtrees and return this value after adding 1 to it 
( Adding current node which is the parent of the two subtrees).

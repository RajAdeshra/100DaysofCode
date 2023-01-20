Topic: Root Equals Sum of Children
Problem: The root of a binary tree that consists of exactly 3 nodes: the root, its left child, and its right child. 
Return true if the value of the root is equal to the sum of the values of its two children, or false otherwise.

Example 1:
Input: root = [10,4,6]
Output: true
Explanation: The values of the root, its left child, and its right child are 10, 4, and 6, respectively.
10 is equal to 4 + 6, so we return true.

Testcase:
Accepted
Input
root =
[5,3,1]
Output
false
Expected
false

Explanation: 
The left child of the node i is 2i, if the left child exists i.e., 2i > the total number of nodes. For example, the left child of the node 4 is 2*4 i.e., the node 8. 
The right child of the node i is 2i+1, if the right child exists i.e., 2i+1 > the total number of nodes

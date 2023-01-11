### Topic: 
Java Binary Tree inorder Treversal
### PROBLEM: 
Given the root of a binary tree, return the inorder traversal of its nodes' values.

### TESTCASES:
CASE 1:
Input: root = [1,null,2,3]
Output: [1,3,2]

CASE 2:
Input: root = []
Output: []

CASE 3:
Input: root = [1]
Output: [1]

### EXPLANATION
Inorder traversal using recursion:
Step 1: Recursively traverse the left subtree  
Step 2: Now, visit the root  
Step 3: Traverse the right subtree recursively  

 INORDER TRAVERSAL
INPUT: 1 2 3 4 5
LOGIC: (Left, Root, Right) : 4 2 5 1 3

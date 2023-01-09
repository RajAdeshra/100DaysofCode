### Topic of the Day: 
Java Odd Even Linked Lists

### Problem: 
The head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list. The first node is considered odd, and the second node is even, and so on. Note that the relative order inside both the even and odd groups should remain as it was in the input. You must solve the problem in O(1) extra space complexity and O(n) time complexity.

Example 1:
Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]

Example 2:
Input: head = [2,1,3,5,6,4,7]
Output: [2,3,6,7,1,5,4]
 
### Testcase:
Accepted
Runtime: 0 ms
Your input: [1,6,3,9,5]
Output: [1,3,5,6,9]
Expected: [1,3,5,6,9]

### Constraints:
The number of nodes in the linked list is in the range [0, 104].
-106 <= Node.val <= 106

### Explanation:
The main idea to solve this problem is to use simple traversal in the linked lists.
Traverse through the linked list and maintain a variable that keeps track of whether the current node is at an odd index or even index.
If the current node is at an odd index, assign it as the next node of the odd linked list.
If the current node is at an even index, assign it as the next node of the even linked list.
Finally, a head node of the even linked list is the next node at the end of the odd linked list, hence grouping odd and even indices together.
Return the head of the newly grouped linked list as our answer.

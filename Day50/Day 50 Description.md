Day 50 of my 100 days of code
### TOPIC: 
    Palindrome Linked Lists

Example 1:
Input: head = [1,2,2,1]
Output: true

Example 2:
Input: head = [1,2]
Output: false
 
### Testcase:
Accepted
Runtime: 0 ms
Your input: [2,5,8,5,2]
Output: true
Expected: true

### Constraints:
The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9

### Explanation:
Determine if it is a palindrome. We can create a new list in reversed order and then compare each node. 
The time and space are O(n). We can use a fast and slow pointer to get the center of the list, then reverse the second list and compare two sublists.


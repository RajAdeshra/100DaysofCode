### Topic: 
Delete Nth node from the end of the list

Example 1:
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Example 2:
Input: head = [1], n = 1
Output: []

Example 3:
Input: head = [1,2], n = 1
Output: [1]

### Testcase:
Accepted
Runtime: 0 ms
Your input: [1,2,3,4,5]
2
Output: [1,2,3,5]
Expected: [1,2,3,5]
 
### Constraints:
The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz
 
### Explanation: 
1. Traverse linked list and find the length M. 
2. Again traverse linked list from the start till we reach the (M-N)th node. 
3. Now we delete the (M-N+1)th node and the return the head pointer. Before deleting the node, we need to relink the next pointer of the (M-N+2)th node.

Day 49 of my 100 Days of Code
### TOPIC: 
Merge Two Sorted linked list.
### Examples:
Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: list1 = [], list2 = []
Output: []

Example 3:
Input: list1 = [], list2 = [0]
Output: [0]
 
### Testcase:
Your input: [2,6,9]
[5,7,9]
Output: [2,5,6,7,9,9]
Expected: [2,5,6,7,9,9]

### Constraints:
The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.


### Explanation:
The key to solve the problem is defining a fake head. Then compare the first elements from each list. Add the smaller one to the merged list. 
Finally, when one of them is empty, simply append it to the merged list, since it is already sorted.

### Topic: 
Java Minimum Absolute Difference (BST)
### Question: 
An array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.
Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] 
follows a, b are from arr a < b, b - a equals to the minimum absolute difference of any two elements in arr
 
Example 1:
Input: arr = [4,2,1,3]
Output: [[1,2],[2,3],[3,4]]
Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.

Example 2:
Input: arr = [1,3,6,10,15]
Output: [[1,3]]

### Testcase:
Accepted
Input
arr =
[3,8,-10,23,19,-4,-14,27]
Output
[[-14,-10],[19,23],[23,27]]
Expected
[[-14,-10],[19,23],[23,27]]

### Explanation:
For an element x present at index i in the array its minimum absolute difference is calculated as: 
Min absolute difference (x) = min(abs(x – arr[j])), where 1 <= j <= n and j != i and abs is the absolute value. Naive approach: Using two loops.

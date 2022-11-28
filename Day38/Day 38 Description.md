          DAY 38 OF MY 100 DAYS OF CODE
### TOPIC: 
    Java Permutation Array
### QUESTION: 
    An array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
 
    Example 1:
    Input: nums = [1,2,3]
    Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
    Example 2:
    Input: nums = [0,1]
    Output: [[0,1],[1,0]]

### TESTCASE:
    Your input: [1,2,3]
    [0,1]
    [1]
    Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
    [[0,1],[1,0]]
    [[1]]
    Expected: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
    [[0,1],[1,0]]

### EXPLANATION:
    It could be solved using modified DFS. Each time insert one element that has not been inserted yet.
    The idea it so start with empty set. Each time , one number is introduced, for each existing solution, insert this number to all possible positions. 
    This is the non-DFS version solution.
    The number of permutations of n objects taken r at a time is determined by the following formula: P(n,r)=n! (n−r)!

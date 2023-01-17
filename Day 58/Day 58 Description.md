### Topic of the Day: 
Java First Bad Version (Binary search)
We are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

Example 1:
Input: n = 5, bad = 4
Output: 4
Explanation:
call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true
Then 4 is the first bad version.

Example 2:
Input: n = 1, bad = 1
Output: 1

### Testcase:
Your input
5
4
1
1
Output
4
1
Expected
4
1

### Explanation:
 Suppose we maintained a checklist of which product passed and which one failed, 
 then our list would be like this -> [ true, true, true, { lots of true }, true, false, false, { lots of falses }, false ]. 
 There exists a point from 1 to n where the product transits from being continuously good to being continuously bad

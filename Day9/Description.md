// Day 9 Of 100 Days of Code Challenge. 
I took a break from this challenge due to mid-term exams but now resuming the challenge.
### TOPIC: 
    Array

### Question: 
We define the following:
A subarray of an n-element array is an array composed from a contiguous block of the original array's elements. For example, if array=[1,2,3], 
then the subarrays are [1],[2],[3],[1.2],[2,3] and [1,2,3]. Something like  would not be a subarray as it's not a contiguous subsection of the original array.
The sum of an array is the total sum of its elements.
An array's sum is negative if the total sum of its elements is negative.
An array's sum is positive if the total sum of its elements is positive.
Given an array of  integers, find and print its number of negative subarrays on a new line.

### Constraints:
1 ≤ n ≤ 100
-10^4 <= a <=10^4

Sample Input
5
1 -2 4 -5 1

Sample Output:
9

### LOGIC:
    There are nine negative subarrays of A[1,-2,4,-,1]
     * -2
     * -5
     * -1
     * -1
     * -4
     * -3
     * -2
     * -2
     * -1
     Thus, we print 9 on a new line.
--------------------------------------------------------------------------------------------------------------------------------------------------------
   ### Code:
    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    public class Solution {

    public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] array1= new int[n];
    for(int i=0;i<n;i++){
        array1[i]=sc.nextInt();
     }
    int count=0;
    for(int j=0;j<n;j++){
        int sum=0;
        for(int k=j;k<n;k++){
            sum=array1[k]+sum;
            if(sum<0){
                count++;
            }
        }
    }
    System.out.println(count);
    }
}

     

    

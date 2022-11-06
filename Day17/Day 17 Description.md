  Day 17 of my 100 Days of Code
 
### TOPIC:
    Java BigDecimal
### QUESTION:
    Given an array, s of n real number strings, sort them in descending order. 
    Each number must be printed in the exact same format as it was read from stdin, meaning that .1 is printed as, and .1 is printed as . 
    If two numbers represent numerically equivalent values (e.g. .1=0.1), then they must be listed in the same order as they were received as input).
    Complete the code in the unlocked section of the editor below. You must rearrange array 's elements according to the instructions above.
    Input Format
    The first line consists of a single integer,n, denoting the number of integer strings.
    Each line i of the n subsequent lines contains a real number denoting the value of s.
    Output Format
    Locked stub code in the editor will print the contents of array s to stdout. You are only responsible for reordering the array's elements.
### CONSTRAINTS:
   * 1<=N<=200
   * Each s has at most 300 digits.
### TEST CASES:
    CASE 1:
    INPUT:
    10
    123
    45
    766
    324324
    .324
    0.325
    -234
    4546
    100
     0
    OUTPUT:
    324324
    4546
    766
     123
     100
     45
     0.325
    .324 
     0
    -234
    CASE 2:
    INPUT:
    9
   -100
    50
    0
    56.6
    90
    0.12
    .12
    02.34
    000.000
    OUTPUT:
    90
    56.6
    50
    02.34
    0.12
    .12
    0
    000.000
   -100
### LOGIC:
    Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. We sort the array in descending order as required in the question and then convert 
    the numbers in the exact format as they were in input.
    
    -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### CODE:
    import java.math.BigDecimal;
    import java.util.*;
    class Solution{

    public static void main(String []args){
    //Input
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    String []s=new String[n+2];
    for(int i=0;i<n;i++){
    s[i]=sc.next();
    }
    sc.close();

    //Write your code here
    for(int i=1; i<n ; i++){
    for(int j=i; j>=1; j--){

    if(new BigDecimal(s[j]).compareTo(new BigDecimal(s[j-1]))>0){   
    String temp = s[j];
    s[j] = s[j-1];
    s[j-1] = temp;
                    
    }else{
     break;
    }
    }  
    } 
        

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
    }
    

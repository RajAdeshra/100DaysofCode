     Day 15 of My 100 Days of Code
 ### TOPIC: 
      Java Static Initializer Block
 ### QUESTION:
     Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.
     You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth B and height H. 
     You should read the variables from the standard input.
     If B<=0 or H<=0, the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.     
     Input Format
     There are two lines of input. The first line contains : the breadth of the parallelogram. 
     The next line contains : the height of the parallelogram.
     Output Format
     If both values are greater than zero, then the main method must output the area of the parallelogram. 
     Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes
###  CONSTRAINTS:
     * -100<=B<=100
     * -100<=H<=100
###  TEST CASES:
     CASE 1:
     INPUT:
     1
     3
     OUTPUT:
     3
     CASE 2:
     INPUT:
     -1
      2
     OUTPUT:
     java.lang.Exception: Breadth and height must be positive.
     CASE 3:
     INPUT:
     100
     -99
     OUTPUT:
     java.lang.Exception: Breadth and height must be positive
###  LOGIC:
     We compute the area of parallelogram and print it after inputting the height and base.
     If both values are greater than zero, then the main method must output the area of the parallelogram. 
     Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
 --------------------------------------------------------------------------------------------------------------------------------------------------
### CODE:
    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    public class Solution {

    static boolean flag = true; 
    static int B,H;
    static{
    Scanner scan = new Scanner(System.in);
    B = scan.nextInt();
    scan.nextLine();
    H = scan.nextInt();
    scan.close();
    if(B>0 && H>0){
    flag = true;
    }else if(B<=0 || H<=0){
    flag=false;
    System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
    }
    public static void main(String[] args){
    if(flag){
    int area=B*H;
    System.out.print(area);
    }
    
    }//end of main
    }//end of class

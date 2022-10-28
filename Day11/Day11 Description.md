 Day 11 of My 100 Days Of Code
 ### Topic: 
     Java Int to String

### Question:
     You are given an integer n, you have to convert it into a string.
     Please complete the partially completed code in the editor. 
     If your code successfully converts n into a string s the code will print "Good job". Otherwise it will print "Wrong answer".
     n can range between -100 to 100 inclusive.

    Sample Input 0
    100
    Sample Output 0
    Good job
    
### TEST CASES:
    CASE 1: Normal inputs for which n lies within -100 and 100.
    INPUT:
    78
    OUTPUT:
    Good job
    CASE 2: String output to determine what will be the output.
    INPUT:
    I am raj adeshra
    OUTPUT:
    Exception in thread "main" java.util.InputMismatchException
	  at java.util.Scanner.throwFor(Scanner.java:909)
### LOGIC:
    we use ToString method that returns the string representation of the object that we make of the inputted integer.
    Then it returns "good job" on successful convertion and return "wrong answer" if it does convert properly.
------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### Code:
    import java.util.*;
    import java.security.*;
    public class Solution {
    public static void main(String[] args) {

    DoNotTerminate.forbidExit();

    try {
    Scanner in = new Scanner(System.in);
    int n = in .nextInt();
    in.close();
    //String s=???; Complete this line below

    //Write your code here
    String s = Integer.toString(n);
    if (n == Integer.parseInt(s)) {
    System.out.println("Good job");
    } else {
    System.out.println("Wrong answer.");
     }
     } catch (DoNotTerminate.ExitTrappedException e) {
    System.out.println("Unsuccessful Termination!!");
     }
     }
     }
     //The following class will prevent you from terminating the code using exit(0)!
     class DoNotTerminate {
     public static class ExitTrappedException extends SecurityException {
     private static final long serialVersionUID = 1;
     }
     public static void forbidExit() {
     final SecurityManager securityManager = new SecurityManager() {
     @Override
     public void checkPermission(Permission permission) {
     if (permission.getName().contains("exitVM")) {
     throw new ExitTrappedException();
     }
     }
     };
     System.setSecurityManager(securityManager);
     }
     }

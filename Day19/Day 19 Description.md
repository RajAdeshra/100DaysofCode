Day 19 of 100 Days of Code
### TOPIC:
    Java ArrayList
### QUESTION:
    Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.
    You are given n lines. In each line there are zero or more integers. 
    You need to answer a few queries where you need to tell the number located in yth position of xth line.
    Input Format
    The first line has an integer n.
    In each of the next n lines there will be an integer d denoting number of integers on that line and then there will be d space-separated integers. 
    In the next line there will be an integer q denoting number of queries. Each query will consist of two integers x and y.
    Output Format
    In each line, output the number located in yth position of xth line. If there is no such position, just print "ERROR!"
### TEST CASES:
    Input
    5
    5 41 77 74 22 44
    1 12
    4 37 34 36 52
    0
    3 20 22 33
    5
    1 3
    3 4
    3 1
    4 3
    5 5
    Output
    74
    52
    37
    ERROR!
    ERROR!
_________________________________________________________________________________________________________________________________
### CODE:
    import java.io.*;
    import java.util.*;
    public class solution {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.nextLine();
    ArrayList<ArrayList<String>> a = new ArrayList<ArrayList<String>>(n);
    for (int i = 0; i < n; i++) {
    s = sc.nextLine();
    a.add(i, new ArrayList<String>(Arrays.asList(s.split("\\s"))));
    }
    int m = sc.nextInt();
    for (int i = 0; i < m; i++) {
    int x = sc.nextInt();
    int y = sc.nextInt();
    if (x <= a.size() && y < a.get(x-1).size() && y >= 0) {
    System.out.println(a.get(x-1).get(y));
    } else {
    System.out.println("ERROR!");
    }
    }
    }
    }

DAY 2 OF MY 100 DAYS OF CODE
### TOPIC: 
    Java Sort
### QUESTION:
    You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange them according to their CGPA in decreasing order. 
    If two student have the same CGPA, then arrange them according to their first name in alphabetical order. 
    If those two students also have the same first name, then order them according to their ID. No two students have the same ID.
    Input Format
    The first line of input contains an integer N, representing the total number of students. 
    The next N lines contains a list of student information in the following structure:
    ID Name CGPA    
    Output Format
    After rearranging the students according to the above rules, print the first name of each student on a separate line.
### CONSTRAINTS:
    2<=N<=1000
    0<=ID<=100000
    5<=|Name|<=30
    0<=cgpa<=4.0
### TEST CASES:
    CASE 1: testing the code if we input same cgpa
    INPUT:
    5
    3 akashs 3.69
    30 shayla 3.80
    32 anik 3.68
    2 swapnil 3.69
    300 towhid 3.9
    OUTPUT:
    towhid
    shayla
    akashs
    swapnil
    anik
### EXPLANATION:
    The code starts by creating a Scanner object.
    The next line of code is the first for loop, which iterates through all the test cases and creates a Student object with an id, fname, and cgpa value.
    The second for loop iterates through all the students in studentList and prints their name on System.out.
    The code is meant to sort a list of students by their GPA.
    We use comparators to sort a list of objects.
__________________________________________________________________________________________________________________________________________________________________
### CODE:
    import java.util.*;
    class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
    super();
    this.id = id;
    this.fname = fname;
    this.cgpa = cgpa;
    }
    public int getId() {
    return id;
    }
    public String getFname() {
      return fname;
    }
    public double getCgpa() {
      return cgpa;
    }
    }
    //Complete the code
    public class Solution
    {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int testCases = Integer.parseInt(in.nextLine());
    List<Student> studentList = new ArrayList<Student>();
    while(testCases>0){
    int id = in.nextInt();
    String fname = in.next();
    double cgpa = in.nextDouble();
    Student st = new Student(id, fname, cgpa);
    studentList.add(st);
    testCases--;
    }
    Collections.sort(studentList,new Comparator<Student>(){
    public int compare(Student s1, Student s2){
    if((s1.getCgpa()*100) != (s2.getCgpa()*100)){
    return (int)((s2.getCgpa()*1000) - (s1.getCgpa()*1000));
    }
    else if(!(s1.getFname().equals(s2.getFname()))){
    return s1.getFname().compareTo(s2.getFname());
    }
    else{
    return s1.getId()-s2.getId();
    }
    }
    } 
      
      for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }
}

    

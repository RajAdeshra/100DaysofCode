import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    printDecreasing(n);
  }

  public static void printDecreasing(int n) {
    if (n >= 1)
    {
      System.out.println(n);
      n = n - 1;
      printDecreasing(n);
    }
  }

}

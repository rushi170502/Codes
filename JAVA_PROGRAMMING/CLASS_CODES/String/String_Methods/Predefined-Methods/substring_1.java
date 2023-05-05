
// substring(int );

import java.util.*;

class MethodDemo{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    String str1 = sc.nextLine();

    System.out.println("Enter the index u want to find substring  :");
    int index = sc.nextInt(); 
    // method use
    System.out.println(str1.substring(index));

    }
}
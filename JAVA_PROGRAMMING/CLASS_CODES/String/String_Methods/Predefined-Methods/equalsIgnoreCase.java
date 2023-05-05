
// equalsIgnoreCase () method :
import java.util.*;

class MethodDemo{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    String str1 = sc.nextLine();
    System.out.println("Enter the string");
    String str2 = sc.nextLine();
    
    // method uses
    System.out.println(str1.equalsIgnoreCase(str2));

    }
}
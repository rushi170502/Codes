
//replace() method :
import java.util.*;

class MethodDemo{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    String str1 = sc.nextLine();

    System.out.println("Enter the old character u want to replace  :");
    char old_ch = sc.next().charAt(0);

    System.out.println("Enter the new character u want to replace  :");
    char new_ch = sc.next().charAt(0);
   
    // method use
    System.out.println(str1.replace(old_ch,new_ch));

    }
}
import  java.util.*;

class MethodDemo{
    public static void main(String[] args) {
        
        // taking from user 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1 : ");
        String str3 = sc.next();
        System.out.println("Enter string 2 : ");    
        String str4 = sc.next();

        System.out.println(str3.concat(str4));
        sc.close();
   
       
    }
    
}
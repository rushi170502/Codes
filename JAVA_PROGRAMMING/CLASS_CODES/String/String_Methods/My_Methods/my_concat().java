
import  java.util.*;

class MethodDemo{
    public static void main(String[] args) {
       
        // taking from user 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1 : ");
        String str1 = sc.next();
        System.out.println("Enter string 2 : ");    
        String str2 = sc.next();
        
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
    
        char[] ch3 = new char[str1.length() + str2.length()];
        int itr = 0;
        for(int i = 0; i < ch1.length ; i++){
            ch3[itr++] = ch1[i];
         }
         for(int i = 0; i < ch2.length ; i++){
            ch3[itr++] = ch2[i];
         }
    
        System.out.println(ch3);
        sc.close();
    }
    
}
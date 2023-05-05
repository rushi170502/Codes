
import  java.util.*;
import java.lang.String;

class MethodDemo{
    public static void main(String[] args) {
        // taking from user 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1 : ");
        String str = sc.nextLine();

        for(int i = 0; i < str.length();i++){

            System.out.println("character at index "+i+" : "+ str.charAt(i));

        }
    
    }
}
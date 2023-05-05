import  java.util.*;
import java.lang.String;

class MethodDemo{
    public static void main(String[] args) {
        // taking from user 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1 : ");
        String str3 = sc.nextLine();
        System.out.println("String length is : "+str3.length());

        sc.close();
    /*
       //user defined method 1
        int cnt = 0;
       char ch[] = str3.toCharArray();
        for(int i=0; i<ch.length; i++){
                cnt++;
        }

        System.out.println(cnt);

        */

    }
}


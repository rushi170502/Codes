

import java.util.*;
class MethodDemo{
    public static void main(String[] args) {
        // taking from user 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1 : ");
        String str2 = sc.nextLine();

        int cnt = 0;
        char ch[] = str2.toCharArray();
        for(char x : ch){
            cnt++;
        }
        System.out.println(cnt);
        sc.close();
    
    }
}
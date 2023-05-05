package My_Methods;
import  java.util.*;

class MethodDemo{
    public static void main(String[] args) {
        // taking from user 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1 : ");
        String str1 = sc.nextLine();
        System.out.println("Enter string 2 : ");
        String str2 = sc.nextLine();

        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        int flag = 0;
        if(str1.length() == str2.length()){
            for(int i = 0; i < ch1.length; i++){
                if(ch1[i] == ch2[i]){
                    flag = 0;
                    continue ;          
                }else{
                    flag = 1;
                    break;
                }                   
            }
            if(flag == 0)
            System.out.println(true);
             else
            System.out.println(false);
            
        }else if(str1.length() != str2.length()) {
            System.out.println("False");
        }
        sc.close();
    }
}

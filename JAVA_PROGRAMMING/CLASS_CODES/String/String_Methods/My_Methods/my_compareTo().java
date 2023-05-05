
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
        int diff = 0;
        if(str1.length() == str2.length()){
            for(int i = 0; i < ch1.length; i++){
                
                if(ch1[i] != ch2[i]){
                    diff = ch1[i] - ch2[i] + 32 - 32; 
                    System.out.println("Difference is : "+diff);  
                    break;             
                }
                                
            }
            if(diff == 0)
                System.out.println(0 );
        }else if(str1.length() != str2.length()) {
            System.out.println("Not Equal");
        }
        
    }
}

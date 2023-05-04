
// PROGRAM 4:
import java.io.*;
class Demo{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the character1 : ");
        char ch1 = (char)br.read();
        br.skip(2);
        System.out.println("Enter the character2 :");
        char ch2 = (char)br.read();
        if(ch1 == ch2){
            System.out.println("Both are equal ");
        }else{
            int diff= ch2 - ch1;
            System.out.println("Difference between "+ch1+ " and "+ch2+ " is "+diff);
        }

    }
}

import java.io.*;
class Demo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Lower limit  :  ");
        int start = Integer.parseInt(br.readLine());
        System.out.println("Enter the Higher limit  :  ");
        int end = Integer.parseInt(br.readLine());

        for(int i = start; i <= end ; i++){
            int rev = 0;
            int num = i;
            while(num != 0) {
                int rem = num % 10;
                rev = rev * 10 + rem;
                num /= 10;
                if(rem == 0){
                    System.out.print(0+rev);
                }
            }
                System.out.print(rev+"\t");
        }
    }
}
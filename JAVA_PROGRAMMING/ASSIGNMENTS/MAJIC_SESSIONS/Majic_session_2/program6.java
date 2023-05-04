
import java.io.*;
class Demo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 1; i <= 5 ;i++){
            int count = 0;
            System.out.println("Enter the num :"+i);
            int num = Integer.parseInt(br.readLine());
            int temp =num;
            while(num != 0){
                count++;
                num /= 10;
            }
            System.out.println("Digit count of in "+temp+" = "+count);

        }

    }
}
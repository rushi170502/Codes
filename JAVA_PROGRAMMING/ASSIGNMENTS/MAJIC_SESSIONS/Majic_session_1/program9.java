
import java.io.*;
class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number :");
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        while(num != 0){
            int fact = 1;
            int rem = num%10;
            for(int i = 1; i <= rem ;i++){
                fact = fact * i;
            }
            sum = sum + fact;
            num/=10;
        }
        System.out.println("sum of Factorial is  "+sum);
    }
}
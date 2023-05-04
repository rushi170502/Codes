import java.io.*;
class Demo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Lower limit  :  ");
        int start = Integer.parseInt(br.readLine());
        System.out.println("Enter the Higher limit  :  ");
        int end = Integer.parseInt(br.readLine());

        for(int i = start; i <= end ; i++){
            int num = i;
            int count = 0;
            int sum =0;
            while(num != 0) {
                int rem = num % 10;
                int fact = 1;
                for (int j = 1; j <= rem; j++) {
                    fact = fact * j;
                }
                sum = sum + fact;
                num /= 10;
            }
            if(sum == i)
                System.out.print("\t"+i);
        }
    }
}
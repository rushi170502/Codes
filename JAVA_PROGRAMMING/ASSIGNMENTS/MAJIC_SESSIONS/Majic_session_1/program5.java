

// PROGRAM 5:
import java.io.*;
class Demo{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows");
        int row = Integer.parseInt(br.readLine());
        int a = 0,b=1,c=0;
        for (int i=1; i<=row;i++){
            for (int j = 1; j <= i; j++){
                System.out.print("  "+(a));
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println();
        }
    }
}
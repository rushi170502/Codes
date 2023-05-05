
import java.io.*;

class operations{

    static void add(int a, int b){

        int ans = a + b;
        System.out.println("Addition is : "+ans);

    }
    static void sub(int a, int b){

        int ans = a - b;
        System.out.println("Subtraction is : "+ans);

    }
    static void mul(int a, int b){

        int ans = a * b;
        System.out.println("Mutliplication is : "+ans);

    }
    static void div(int a, int b){

        int ans = a / b;
        System.out.println("Addition is : "+ans);

    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the value of a  & b :");
        int a = Integer.parseInt(br.readLine());
        int b= Integer.parseInt(br.readLine());

        // function call
        add(a,b);
        sub(a,b);
        mul(a,b);
        div(a,b);
    }

}
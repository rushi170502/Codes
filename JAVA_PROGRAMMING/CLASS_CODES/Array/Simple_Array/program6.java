
// character values array
import java.io.*;
class arrayDemo{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of array  : ");
        int size = Integer.parseInt(br.readLine());

        char arr[] = new char[size];
        System.out.println("Enter the elements of array  : ");
        for(int i = 0 ; i < size; i++){
            arr[i] =br.readLine().charAt(0);
        }

        System.out.println("Elements of array  : ");
        for(int i = 0 ; i < size; i++){
            System.out.println(" "+arr[i]);
        }
    }
}
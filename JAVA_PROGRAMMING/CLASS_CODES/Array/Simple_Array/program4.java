// integer array
import java.io.*;
class arrayDemo{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of array  : ");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];
        System.out.println("Enter the elements of array  : ");
        for(int i = 0 ; i < size; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Elements of array  : ");
        for(int i = 0 ; i < size; i++){
            System.out.println(" "+arr[i]);
        }
    }
}
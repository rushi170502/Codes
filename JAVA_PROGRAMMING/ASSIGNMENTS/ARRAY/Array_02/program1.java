
import java.io.*;

class ArrayDemo{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        System.out.println("Enter the size of array : ");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];
        int sum = 0;
        System.out.println("Enter the Array elements  :");
        for(int i = 0; i < arr.length ; i++){
            arr[i]= Integer.parseInt(br.readLine());
                sum = sum + arr[i];
        }
        for(int i = 0; i< arr.length;i++)
            System.out.print("\t"+arr[i]);

        System.out.println();
        System.out.println("\t"+"Sum = "+sum);
    }
}
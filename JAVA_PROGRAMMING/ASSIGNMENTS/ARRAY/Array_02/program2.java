
import java.io.*;

class ArrayDemo{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        System.out.println("Enter the size of array : ");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];
        int even_cnt = 0;
        int odd_cnt = 0;
        System.out.println("Enter the Array elements  :");
        for(int i = 0; i < arr.length ; i++){
            arr[i]= Integer.parseInt(br.readLine());
            if(arr[i] % 2 == 0)
                even_cnt++;
            else
                odd_cnt++;
        }
        for(int i = 0; i< arr.length;i++)
            System.out.print("\t"+arr[i]);

        System.out.println();
        System.out.println("\t"+"Count of even numbers = "+even_cnt);
        System.out.println("\t"+"Count of odd numbers = "+odd_cnt);

    }
}
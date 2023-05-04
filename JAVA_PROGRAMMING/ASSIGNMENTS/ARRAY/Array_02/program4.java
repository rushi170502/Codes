
import java.io.*;

class ArrayDemo{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        System.out.println("Enter the size of array : ");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];
        System.out.println("Enter the Array elements  :");
        for(int i = 0; i < arr.length ; i++){
            arr[i]= Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the element u want  to search  : ");
        int key = Integer.parseInt(br.readLine());
        for(int i = 0; i< arr.length;i++){
            if(arr[i] == key)
                System.out.println("Element "+key+" found at index "+ i);
        }
        System.out.println();
    }
}
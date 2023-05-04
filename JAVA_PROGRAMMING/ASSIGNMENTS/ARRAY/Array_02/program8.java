
import java.io.*;

class ArrayDemo{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        System.out.println("Enter the size of array : ");
        int size = Integer.parseInt(br.readLine());

        int arr1[] = new int[size];
        int arr2[] = new int[size];

        System.out.println("Enter the Array 1 elements  :");
        for(int i = 0; i < arr1.length ; i++){
            arr1[i]= Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the Array 2 elements  :");
        for(int i = 0; i < arr2.length ; i++){
            arr2[i]= Integer.parseInt(br.readLine());
        }
        int flag = 0;
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length ;j++) {
                if (arr1[i] == arr2[j])
                    flag = 1;
            }
             if(flag == 0)
                    System.out.print("\t"+arr1[i]);

             flag = 0;
        }

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length ;j++) {
                if (arr2[i] == arr1[j])
                    flag = 1;
            }
            if(flag == 0)
                System.out.print("\t"+arr2[i]);
            flag = 0;
        }
    }
}
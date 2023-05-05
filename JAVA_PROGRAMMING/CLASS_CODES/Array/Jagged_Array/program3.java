
import java.util.*;

class ArrayDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows you want :");
        int rows = sc.nextInt();

        int arr[][] = new int[rows][];
        
        for(int i = 0; i < arr.length; i++){

            System.out.println("Enter the columns you want at row "+i+" :");
            int cols = sc.nextInt();
            arr[i] =  new int [cols];  
        }

        System.out.println("Enter the elements of array : ");
        // taking input from user
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length ;j++){

                arr[i][j] = sc.nextInt();

            }
        }
        // printing array by using for each loop
        for(int[] x : arr){
            for(int y : x){
                System.out.print("\t"+y);
            }
            System.out.println();
        }
        sc.close();
    }
}
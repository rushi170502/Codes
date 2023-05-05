
// 2D array concept 
/*
    taking values from user by using bufferedReader class
 */ 

 import java.io.*;

 class ArrayDemo{

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the rows and cols in array  :");
        int rows = Integer.parseInt(br.readLine());
        int cols = Integer.parseInt(br.readLine());

        double arr[][] = new double[rows][cols];

        System.out.println("Enter the array elements  :");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = Double.parseDouble(br.readLine());
            }
        }

        System.out.println("Array elements are :");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

    }
 }

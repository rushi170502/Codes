import java.io.*;
class ArrayDemo{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        System.out.println("Enter the size of array : ");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];
        System.out.println("Enter the Array elements  :");

        for(int i = 0 ; i < size; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0; i < size ; i++){
            int sum = 0;
            int num = arr[i];
            while(num != 0){
                int rem = num % 10;
                sum += rem;
                num /= 10;
            }
            if(sum % 2 == 0){
                System.out.print("\t"+arr[i]);
            }

        }
    }
}